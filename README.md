# snappers - fast and safe snappy compression

Snappers is a PoC project for [roast](https://github.com/roast-rs/roast) to validate ideas and to make sure the workflow is sound.

You can use it, although for now I would not considere it production ready. You might want to pick one of the other available snappy solutions first.

## API
For now only compression is exposed through `byte[] Snappers.compress(byte[] input)` which under the cover uses the pure rust [snap](https://crates.io/crates/snap) snappy library.

I'm planning to add more functionality and benchmarks as soon as roast evolves.

## Building
Since the `roast` CLI is not yet on crates.io, clone the roast project and build the `roast_cli` project manually. You can then use the `roast` command from debug or production.

Then run

```
$ path/to/roast build
```

to build and place the generared code and artifacts into the right place. From there on it is maven land only, so you can run `mvn test`, `mvn package` or `mvn install` at your pleasure. Also feel free to add stuff to the `pom.xml`.

Every time you change the rust code make sure to build it again with the roast command.