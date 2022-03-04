# Horton shazamrecognizer
[Horton](https://github.com/davidtakac/horton) plugin that uses Shazam to recognize songs as laid out in [SongRec](https://github.com/marin-m/SongRec). 

## Description
In spirit, this is an Android port of SongRec. It is a Gradle module that can be dropped in to Horton as-is to achieve recognition with Shazam. It is not officially supported by Horton for legal reasons; I did not want to deal with potential cease and desist letters. 

Had it been just a simple module that communicated with Shazam's servers, I would have deleted it. What makes it special is that it cross-compiles Rust to Android. SongRec is written in Rust and, besides communicating with their servers and providing a GUI, it contains an algorithm that turns an audio file into a fingerprint which Shazam requires to recognize songs. 

Cross-compilation description, instructions and install script are available in `songrecfp`. 

## Horton integration instructions
If you want to see the module in action, you can integrate it into Horton yourself. 

1. Create a new Android library module (e.g. `shazamrecognizer`)
2. Copy all files from root of this repository to the new module
3. Change dependency injection code in `horton/app/di/AppModule` to provide `ShazamSongRecognizer` instead of the current implementation
4. Run the `shazamrecognizer/songrecfp/install` script to cross-compile fingerprint code to Android
5. Congrats, Horton now uses Shazam to recognize songs!

## Valuable resources
- [Mozilla guide](https://mozilla.github.io/firefox-browser-architecture/experiments/2017-09-21-rust-on-android.html)
- [suve's ramblings](https://blog.svgames.pl/article/running-rust-on-android)
