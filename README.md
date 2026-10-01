# Legacy LWJGL3 Pylon Shim

This is the small compatibility shim used with [Pylon](https://github.com/notdevcody/pylon) on Ornithe 1.8.9.

Pylon (the continuation of Lenis) supplies the actual LWJGL 3 compatibility layer. This mod only:

- Satisfies mods that require the `legacy-lwjgl3` mod ID with any Pylon version.
- Provides the optional `PreeditAwareWidget` API expected by AxolotlClient.
- Keeps the IME focus callback as a no-op because Pylon owns the SDL input path.

The original Legacy LWJGL3 project is separate:

https://github.com/moehreag/legacy-lwjgl3

Build with:

```bash
./gradlew build
```

The GitHub Actions `Build` workflow can also be started manually from the repository's Actions tab. It uploads the built JAR as a workflow artifact.
