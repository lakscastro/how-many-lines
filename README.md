<p align="center">
  <img src="https://user-images.githubusercontent.com/51419598/147526726-e460cefc-8e3d-41df-afef-f231d905a912.png">
</p>
<samp><h6 align="center">#tool, #cli, #serverless</h6></samp>
<samp><h1 align="center">How Many Lines</h1></samp>

<h6 align="center"><samp>A Open Source CLI/Server/Workflow/Library to get line count of all GitHub repositories of a specific account</samp></h6>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-22272E?&style=for-the-badge&logo=kotlin&logoColor=9966FF">
  <img src="https://img.shields.io/badge/Javascript-22272E?style=for-the-badge&logo=javascript&logoColor=EFD81D">
  <img src="https://img.shields.io/badge/Typescript-22272E?style=for-the-badge&logo=typescript&logoColor=2F74C0">
  <img src="https://img.shields.io/badge/AWS-22272E?style=for-the-badge&logo=amazon&logoColor=E95F20">
</p>

<p align="center">
  <a href="https://github.com/lakscastro/how-many-lines/actions/workflows/build-readme.yaml">
    <img src="https://github.com/lakscastro/how-many-lines/actions/workflows/build-readme.yaml/badge.svg">
  </a>
</p>

<a href="https://github.com/login/oauth/authorize?scope=repo&client_id=aadfebb55f7e10f9f191"><h4 align="center"><samp>Play It</samp></h4></a>

<br>

## How Many Lines?

Have you ever thought about how many lines of code you've written in your life? Even the one generated by automated tools, after searching I little I tried to count at least the line count of my GitHub since 95% of my code is here.

## How to use

- Authenticate using the OAuth
- Wait for 3~5 minutes and your profile will appear in this `README.md` with the line count

The link that you can use to [authenticate is this one](https://github.com/login/oauth/authorize?scope=repo&client_id=aadfebb55f7e10f9f191)

## How it works

- The OAuth generates an token that can be used to perform several statistics tasks
- The token is sent to a serverless AWS server
- The server validates the token and triggers `open-issue.yaml` workflow with your token
- The `open-issue.yaml` workflow get your token and:
  - Get line count of each repository and sum everything
  - Create a new pool issue, that is useful to store/persist data
- The created issue triggers another workflow `build-readme.yaml`
- This one `build-readme.yaml` get all pool issues and build a formatted markdown and update it

## Contribute

Software always can be improved, so fill a issue to point where we can do it! Thanks.

## Support

If you have ideas to share, bugs to report or need support, you can either open an issue or join our Discord server

<a href="https://discord.gg/86GDERXZNS">
  <kbd><img src="https://discordapp.com/api/guilds/771498135188799500/widget.png?style=banner2" alt="Discord Banner"/></kbd>
</a>

## Add your GitHub stats

To add your GitHub stats here, just auth your account using the application OAuth screen link:

<p align="center"><a href="https://github.com/login/oauth/authorize?scope=repo&client_id=aadfebb55f7e10f9f191"><img src="https://user-images.githubusercontent.com/51419598/147527590-e9e9d50b-8c40-4de7-a621-f910bfddcb37.png" width="280" /></a><p>

<br /><br /><br />

<!-- START README.md STATS GENERATOR -->

<samp>

<hr /><p align="center"><a href="https://github.com/eliziebluiz"><kbd><img src="https://avatars.githubusercontent.com/u/46085746?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/eliziebluiz"><h6 align="center">@eliziebluiz</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 2 2 . 4 8 8 </h3><p align="center"><sub><a href="https://github.com/eliziebluiz">@eliziebluiz</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Nicochess"><kbd><img src="https://avatars.githubusercontent.com/u/66505477?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Nicochess"><h6 align="center">@Nicochess</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 1 2 . 9 9 4 </h3><p align="center"><sub><a href="https://github.com/Nicochess">@Nicochess</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Suburbanno"><kbd><img src="https://avatars.githubusercontent.com/u/13632826?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Suburbanno"><h6 align="center">@Suburbanno</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 1 9 . 1 9 3 </h3><p align="center"><sub><a href="https://github.com/Suburbanno">@Suburbanno</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Senpai-10"><kbd><img src="https://avatars.githubusercontent.com/u/53495583?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Senpai-10"><h6 align="center">@Senpai-10</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 1 . 2 7 7 . 8 2 6 </h3><p align="center"><sub><a href="https://github.com/Senpai-10">@Senpai-10</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Egor-oop"><kbd><img src="https://avatars.githubusercontent.com/u/72152812?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Egor-oop"><h6 align="center">@Egor-oop</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377631-ca8ece53-00c8-401b-9771-ab5d9a8436dc.png" height="60" /></p></a><h3 align="center"> </h3><p align="center"><sub><a href="https://github.com/Egor-oop">@Egor-oop</a> joined the game</sub></p><sub><h6 align="center">wrote less than 100 lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Nerd00F"><kbd><img src="https://avatars.githubusercontent.com/u/42983463?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Nerd00F"><h6 align="center">@Nerd00F</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 3 . 6 8 8 </h3><p align="center"><sub><a href="https://github.com/Nerd00F">@Nerd00F</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/donzal"><kbd><img src="https://avatars.githubusercontent.com/u/36649471?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/donzal"><h6 align="center">@donzal</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377631-ca8ece53-00c8-401b-9771-ab5d9a8436dc.png" height="60" /></p></a><h3 align="center"> </h3><p align="center"><sub><a href="https://github.com/donzal">@donzal</a> joined the game</sub></p><sub><h6 align="center">wrote less than 100 lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/BenStigsen"><kbd><img src="https://avatars.githubusercontent.com/u/24865450?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/BenStigsen"><h6 align="center">@BenStigsen</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 3 1 . 8 3 8 </h3><p align="center"><sub><a href="https://github.com/BenStigsen">@BenStigsen</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/RFLEpicGamer"><kbd><img src="https://avatars.githubusercontent.com/u/69988411?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/RFLEpicGamer"><h6 align="center">@RFLEpicGamer</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377631-ca8ece53-00c8-401b-9771-ab5d9a8436dc.png" height="60" /></p></a><h3 align="center"> </h3><p align="center"><sub><a href="https://github.com/RFLEpicGamer">@RFLEpicGamer</a> joined the game</sub></p><sub><h6 align="center">wrote less than 100 lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Komfudo"><kbd><img src="https://avatars.githubusercontent.com/u/92230672?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Komfudo"><h6 align="center">@Komfudo</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377647-d0948b01-83a9-417f-9dde-27f1f27fa86d.png" height="60" /></p></a><h3 align="center"> 6 8 4 </h3><p align="center"><sub><a href="https://github.com/Komfudo">@Komfudo</a> java class</sub></p><sub><h6 align="center">wrote more than 100 lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/oscie57"><kbd><img src="https://avatars.githubusercontent.com/u/66192059?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/oscie57"><h6 align="center">@oscie57</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 8 . 6 1 0 </h3><p align="center"><sub><a href="https://github.com/oscie57">@oscie57</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/SketchMaster2001"><kbd><img src="https://avatars.githubusercontent.com/u/75850871?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/SketchMaster2001"><h6 align="center">@SketchMaster2001</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 3 3 1 . 7 5 2 </h3><p align="center"><sub><a href="https://github.com/SketchMaster2001">@SketchMaster2001</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Phate6660"><kbd><img src="https://avatars.githubusercontent.com/u/44369810?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Phate6660"><h6 align="center">@Phate6660</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 2 5 . 1 5 0 </h3><p align="center"><sub><a href="https://github.com/Phate6660">@Phate6660</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/That1M8Head"><kbd><img src="https://avatars.githubusercontent.com/u/16748384?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/That1M8Head"><h6 align="center">@That1M8Head</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 4 2 5 . 5 2 0 </h3><p align="center"><sub><a href="https://github.com/That1M8Head">@That1M8Head</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/fluteds"><kbd><img src="https://avatars.githubusercontent.com/u/34608301?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/fluteds"><h6 align="center">@fluteds</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 5 6 . 9 0 1 </h3><p align="center"><sub><a href="https://github.com/fluteds">@fluteds</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/spotlightishere"><kbd><img src="https://avatars.githubusercontent.com/u/10055256?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/spotlightishere"><h6 align="center">@spotlightishere</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377645-7c00264f-3676-41a5-9182-ba6e440a50cd.png" height="60" /></p></a><h3 align="center"> - 1 . 7 9 2 . 3 6 1 </h3><p align="center"><sub><a href="https://github.com/spotlightishere">@spotlightishere</a> wtf?</sub></p><sub><h6 align="center">for some reason, this one has negative line count...</h6></sub></p><hr /><p align="center"><a href="https://github.com/ziad8727"><kbd><img src="https://avatars.githubusercontent.com/u/49759615?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ziad8727"><h6 align="center">@ziad8727</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 2 . 9 4 5 </h3><p align="center"><sub><a href="https://github.com/ziad8727">@ziad8727</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/kotx"><kbd><img src="https://avatars.githubusercontent.com/u/33439542?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/kotx"><h6 align="center">@kotx</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 4 6 . 2 5 1 </h3><p align="center"><sub><a href="https://github.com/kotx">@kotx</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/DopeDealers"><kbd><img src="https://avatars.githubusercontent.com/u/28524646?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/DopeDealers"><h6 align="center">@DopeDealers</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 1 8 . 1 4 1 </h3><p align="center"><sub><a href="https://github.com/DopeDealers">@DopeDealers</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/sudojunior"><kbd><img src="https://avatars.githubusercontent.com/u/8607699?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/sudojunior"><h6 align="center">@sudojunior</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377645-7c00264f-3676-41a5-9182-ba6e440a50cd.png" height="60" /></p></a><h3 align="center"> - 9 0 . 2 0 4 </h3><p align="center"><sub><a href="https://github.com/sudojunior">@sudojunior</a> wtf?</sub></p><sub><h6 align="center">for some reason, this one has negative line count...</h6></sub></p><hr /><p align="center"><a href="https://github.com/jacksonrakena"><kbd><img src="https://avatars.githubusercontent.com/u/44521335?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/jacksonrakena"><h6 align="center">@jacksonrakena</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 9 4 . 8 9 6 </h3><p align="center"><sub><a href="https://github.com/jacksonrakena">@jacksonrakena</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/samualtnorman"><kbd><img src="https://avatars.githubusercontent.com/u/18307063?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/samualtnorman"><h6 align="center">@samualtnorman</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377645-7c00264f-3676-41a5-9182-ba6e440a50cd.png" height="60" /></p></a><h3 align="center"> - 4 2 1 . 1 3 8 </h3><p align="center"><sub><a href="https://github.com/samualtnorman">@samualtnorman</a> wtf?</sub></p><sub><h6 align="center">for some reason, this one has negative line count...</h6></sub></p><hr /><p align="center"><a href="https://github.com/Snazzah"><kbd><img src="https://avatars.githubusercontent.com/u/7025343?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Snazzah"><h6 align="center">@Snazzah</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 2 7 5 . 3 1 7 </h3><p align="center"><sub><a href="https://github.com/Snazzah">@Snazzah</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/YoungTrep"><kbd><img src="https://avatars.githubusercontent.com/u/64561735?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/YoungTrep"><h6 align="center">@YoungTrep</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377645-7c00264f-3676-41a5-9182-ba6e440a50cd.png" height="60" /></p></a><h3 align="center"> - 9 4 3 . 2 3 4 </h3><p align="center"><sub><a href="https://github.com/YoungTrep">@YoungTrep</a> wtf?</sub></p><sub><h6 align="center">for some reason, this one has negative line count...</h6></sub></p><hr /><p align="center"><a href="https://github.com/auguwu"><kbd><img src="https://avatars.githubusercontent.com/u/27751995?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/auguwu"><h6 align="center">@auguwu</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 1 . 3 8 9 . 6 5 7 </h3><p align="center"><sub><a href="https://github.com/auguwu">@auguwu</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Dazorn96"><kbd><img src="https://avatars.githubusercontent.com/u/10536581?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Dazorn96"><h6 align="center">@Dazorn96</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 1 6 . 4 9 6 </h3><p align="center"><sub><a href="https://github.com/Dazorn96">@Dazorn96</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/lucatolton"><kbd><img src="https://avatars.githubusercontent.com/u/41690024?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/lucatolton"><h6 align="center">@lucatolton</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 7 . 1 0 7 </h3><p align="center"><sub><a href="https://github.com/lucatolton">@lucatolton</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/kdev"><kbd><img src="https://avatars.githubusercontent.com/u/42553393?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/kdev"><h6 align="center">@kdev</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 8 2 . 1 5 9 </h3><p align="center"><sub><a href="https://github.com/kdev">@kdev</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Tenrys"><kbd><img src="https://avatars.githubusercontent.com/u/3979239?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Tenrys"><h6 align="center">@Tenrys</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 4 4 0 . 8 9 0 </h3><p align="center"><sub><a href="https://github.com/Tenrys">@Tenrys</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/rodrigonahid"><kbd><img src="https://avatars.githubusercontent.com/u/69832627?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/rodrigonahid"><h6 align="center">@rodrigonahid</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 1 . 4 6 0 . 6 4 7 </h3><p align="center"><sub><a href="https://github.com/rodrigonahid">@rodrigonahid</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Dishit79"><kbd><img src="https://avatars.githubusercontent.com/u/56460773?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Dishit79"><h6 align="center">@Dishit79</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 5 0 9 . 0 2 2 </h3><p align="center"><sub><a href="https://github.com/Dishit79">@Dishit79</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/mathiaslima"><kbd><img src="https://avatars.githubusercontent.com/u/51215681?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/mathiaslima"><h6 align="center">@mathiaslima</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 9 6 . 9 6 8 </h3><p align="center"><sub><a href="https://github.com/mathiaslima">@mathiaslima</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/linuxmobile"><kbd><img src="https://avatars.githubusercontent.com/u/10554636?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/linuxmobile"><h6 align="center">@linuxmobile</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 1 1 . 5 1 6 </h3><p align="center"><sub><a href="https://github.com/linuxmobile">@linuxmobile</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/MCotocel"><kbd><img src="https://avatars.githubusercontent.com/u/74227209?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/MCotocel"><h6 align="center">@MCotocel</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 8 6 . 9 3 0 </h3><p align="center"><sub><a href="https://github.com/MCotocel">@MCotocel</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/arimariojesus"><kbd><img src="https://avatars.githubusercontent.com/u/64603070?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/arimariojesus"><h6 align="center">@arimariojesus</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 1 6 6 . 5 5 4 </h3><p align="center"><sub><a href="https://github.com/arimariojesus">@arimariojesus</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/SolomonRosemite"><kbd><img src="https://avatars.githubusercontent.com/u/60587271?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/SolomonRosemite"><h6 align="center">@SolomonRosemite</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 5 2 3 . 2 6 1 </h3><p align="center"><sub><a href="https://github.com/SolomonRosemite">@SolomonRosemite</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/mannoeu"><kbd><img src="https://avatars.githubusercontent.com/u/53797821?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/mannoeu"><h6 align="center">@mannoeu</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 2 0 4 . 8 8 4 </h3><p align="center"><sub><a href="https://github.com/mannoeu">@mannoeu</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/AkiaCode"><kbd><img src="https://avatars.githubusercontent.com/u/71239005?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/AkiaCode"><h6 align="center">@AkiaCode</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 2 . 8 9 5 . 9 1 2 </h3><p align="center"><sub><a href="https://github.com/AkiaCode">@AkiaCode</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/ThatOneCalculator"><kbd><img src="https://avatars.githubusercontent.com/u/44733677?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ThatOneCalculator"><h6 align="center">@ThatOneCalculator</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 1 2 7 . 5 2 6 </h3><p align="center"><sub><a href="https://github.com/ThatOneCalculator">@ThatOneCalculator</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/BerkSpar"><kbd><img src="https://avatars.githubusercontent.com/u/47111228?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/BerkSpar"><h6 align="center">@BerkSpar</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 1 4 4 . 9 4 6 </h3><p align="center"><sub><a href="https://github.com/BerkSpar">@BerkSpar</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/ibx34"><kbd><img src="https://avatars.githubusercontent.com/u/51100404?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ibx34"><h6 align="center">@ibx34</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 2 0 1 . 1 4 4 </h3><p align="center"><sub><a href="https://github.com/ibx34">@ibx34</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Domterion"><kbd><img src="https://avatars.githubusercontent.com/u/35433518?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Domterion"><h6 align="center">@Domterion</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 9 3 . 2 5 7 </h3><p align="center"><sub><a href="https://github.com/Domterion">@Domterion</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/luanbatistadev"><kbd><img src="https://avatars.githubusercontent.com/u/56078396?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/luanbatistadev"><h6 align="center">@luanbatistadev</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 5 . 8 8 7 </h3><p align="center"><sub><a href="https://github.com/luanbatistadev">@luanbatistadev</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/TorchedSammy"><kbd><img src="https://avatars.githubusercontent.com/u/38820196?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/TorchedSammy"><h6 align="center">@TorchedSammy</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 2 3 . 8 8 5 </h3><p align="center"><sub><a href="https://github.com/TorchedSammy">@TorchedSammy</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/ArnabXD"><kbd><img src="https://avatars.githubusercontent.com/u/52126165?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ArnabXD"><h6 align="center">@ArnabXD</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 4 4 . 6 6 0 </h3><p align="center"><sub><a href="https://github.com/ArnabXD">@ArnabXD</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/lakscastro"><kbd><img src="https://avatars.githubusercontent.com/u/51419598?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/lakscastro"><h6 align="center">@lakscastro</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 2 . 6 5 9 . 1 4 2 </h3><p align="center"><sub><a href="https://github.com/lakscastro">@lakscastro</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr />

</samp>

<!-- END README.md STATS GENERATOR -->

<br>
<br>
<br>
<br>

## Why Kotlin/Ts/Js?

- NodeJS is easy to deploy as serverless functions, so I wrote the server using vanilla JS. 
- Typescript is helpful to write libraries, so I did. 
- And Kotlin... well, I'm learning Kotlin.

<br>
<br>
<br>
<br>

<samp>

<h2 align="center">
  Open Source
</h2>
<p align="center">
  <sub>Copyright © 2021-present, Laks Castro.</sub>
</p>
<p align="center">How Many Lines <a href="/LICENSE">is MIT licensed 💖</a></p>
<p align="center">
  <img src="https://user-images.githubusercontent.com/51419598/147527527-ea501436-1043-410b-ba15-978c6424eb17.png" width="35" />
</p>

</samp>
