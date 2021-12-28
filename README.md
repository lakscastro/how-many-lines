<p align="center">
  <img src="https://user-images.githubusercontent.com/51419598/147526726-e460cefc-8e3d-41df-afef-f231d905a912.png">
</p>
<samp><h6 align="center">#tool, #cli, #serverless</h6></samp>
<samp><h1 align="center">How Many Lines</h1></samp>
<samp><h6 align="center">A Open Source CLI/Server/Workflow/Library to get line count of all GitHub repositories of a specific account</h6></samp>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-22272E?&style=for-the-badge&logo=kotlin&logoColor=9966FF">
  <img src="https://img.shields.io/badge/Javascript-22272E?style=for-the-badge&logo=javascript&logoColor=EFD81D">
  <img src="https://img.shields.io/badge/Typescript-22272E?style=for-the-badge&logo=typescript&logoColor=2F74C0">
  <img src="https://img.shields.io/badge/AWS-22272E?style=for-the-badge&logo=amazon&logoColor=E95F20">
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

## Add your GitHub stats

To add your GitHub stats here, just auth your account using the application OAuth screen link:

<p align="center"><a href="https://github.com/login/oauth/authorize?scope=repo&client_id=aadfebb55f7e10f9f191"><img src="https://user-images.githubusercontent.com/51419598/147527590-e9e9d50b-8c40-4de7-a621-f910bfddcb37.png" width="280" /></a><p>

<br /><br /><br />

<!-- START README.md STATS GENERATOR -->

<samp>

<hr /><p align="center"><a href="https://github.com/BerkSpar"><kbd><img src="https://avatars.githubusercontent.com/u/47111228?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/BerkSpar"><h6 align="center">@BerkSpar</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 1 4 4 . 9 4 6 </h3><p align="center"><sub><a href="https://github.com/BerkSpar">@BerkSpar</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/ibx34"><kbd><img src="https://avatars.githubusercontent.com/u/51100404?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ibx34"><h6 align="center">@ibx34</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377655-9e8a5d3a-4af2-4409-b479-28dedbabe4c2.png" height="60" /></p></a><h3 align="center"> 2 0 1 . 1 4 4 </h3><p align="center"><sub><a href="https://github.com/ibx34">@ibx34</a> are u ok?</sub></p><sub><h6 align="center">wrote more than 100K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/Domterion"><kbd><img src="https://avatars.githubusercontent.com/u/35433518?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/Domterion"><h6 align="center">@Domterion</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 9 3 . 2 5 7 </h3><p align="center"><sub><a href="https://github.com/Domterion">@Domterion</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/luanbatistadev"><kbd><img src="https://avatars.githubusercontent.com/u/56078396?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/luanbatistadev"><h6 align="center">@luanbatistadev</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377651-d10bba7e-6e08-47fc-82e8-4ad186203510.png" height="60" /></p></a><h3 align="center"> 5 . 8 8 7 </h3><p align="center"><sub><a href="https://github.com/luanbatistadev">@luanbatistadev</a> why so dark?</sub></p><sub><h6 align="center">wrote more than 1K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/TorchedSammy"><kbd><img src="https://avatars.githubusercontent.com/u/38820196?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/TorchedSammy"><h6 align="center">@TorchedSammy</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 2 3 . 8 8 5 </h3><p align="center"><sub><a href="https://github.com/TorchedSammy">@TorchedSammy</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/ArnabXD"><kbd><img src="https://avatars.githubusercontent.com/u/52126165?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/ArnabXD"><h6 align="center">@ArnabXD</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377652-285419d4-973b-4436-a31b-e8edd255ed83.png" height="60" /></p></a><h3 align="center"> 4 4 . 6 6 0 </h3><p align="center"><sub><a href="https://github.com/ArnabXD">@ArnabXD</a> what's grass?</sub></p><sub><h6 align="center">wrote more than 10K lines of code across all Github repos</h6></sub></p><hr /><p align="center"><a href="https://github.com/lakscastro"><kbd><img src="https://avatars.githubusercontent.com/u/51419598?v=4" width="100" height="100" alt="Profile Picture"/></kbd></a><a href="https://github.com/lakscastro"><h6 align="center">@lakscastro</h6></a><a href="/GUIDE.md"><p align="center"><img src="https://user-images.githubusercontent.com/51419598/147377660-76209d64-8cd1-4de7-a36c-24edf5b3da98.png" height="60" /></p></a><h3 align="center"> 2 . 6 5 9 . 1 4 2 </h3><p align="center"><sub><a href="https://github.com/lakscastro">@lakscastro</a> u aren't ok</sub></p><sub><h6 align="center">wrote more than 1M lines of code across all Github repos</h6></sub></p><hr />

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
