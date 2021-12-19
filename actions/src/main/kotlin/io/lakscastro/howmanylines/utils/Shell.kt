package io.lakscastro.howmanylines.utils

import com.lordcodes.turtle.shellRun
import io.lakscastro.howmanylines.services.Environment
import java.io.File

/// OS Executables
const val CMD = "cmd.exe"
const val BASH = "bash"
const val NODE = "node"
const val NPM = "npm"

/// Executable constants
const val LINE_COUNT_CLI = "line-count.js"
const val INSTALL_CLI = "install"
const val CMD_COMMAND = "/c"
const val BASH_COMMAND = "-c"

/// Script constants
const val NODE_JS_CLI_FOLDER = "../cli"

/// `command` isn't the `cmd.exe` or `bash`
/// but the executable that you need to run like `node` or `pip`
fun shell(command: String, arguments: Array<String>, workingDir: File): String {
  val executable = if (os.isWindows()) CMD else BASH
  val arg = if (os.isWindows()) CMD_COMMAND else BASH_COMMAND

  return shellRun(executable, listOf(arg, command, *arguments), workingDir)
}

/// `command` isn't the `cmd.exe` or `bash`
/// but the executable that you need to run like `node` or `pip`
fun runNodeShell(arguments: Array<String>, workingDir: File): String = shell(NODE, arguments, workingDir)

/// `command` isn't the `cmd.exe` or `bash`
/// but the executable that you need to run like `node` or `pip`
fun runNpmShell(arguments: Array<String>, workingDir: File): String = shell(NPM, arguments, workingDir)

/// Execute the CLI module that can be found in `~/cli` repository folder
///
/// Why don't write this script in Node instead running as command from Kotlin?
/// ...Well, why not?
fun runLineCountCLI(): Int {
  val workingDir = Environment.workingDir.resolve(NODE_JS_CLI_FOLDER)

  fun installNpmDependencies() {
    val commands = listOf(
      arrayOf(INSTALL_CLI, "-D", "typescript"),
      arrayOf(INSTALL_CLI, "-D", "ts-node"),
      arrayOf(INSTALL_CLI)
    )

    for (command in commands) {
      runNpmShell(arrayOf(*command), workingDir)
    }
  }

  installNpmDependencies()

  return runNodeShell(arrayOf(LINE_COUNT_CLI), workingDir).toInt()
}
