# snappers - fast and safe snappy compression

Snappers is a PoC project for [roast](https://github.com/roast-rs/roast) to validate ideas and to make sure the workflow is sound.

You can use it, although for now I would not considere it production ready. You might want to pick one of the other available snappy solutions first.

## API
For now only compression is exposed through `byte[] Snappers.compress(byte[] input)` which under the cover uses the pure rust [snap](https://crates.io/crates/snap) snappy library.

I'm planning to add more functionality and benchmarks as soon as roast evolves.