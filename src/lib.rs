#[macro_use]
extern crate roast;
extern crate snap;

use snap::{Decoder, Encoder};

#[derive(Debug, RoastExport)]
struct Snappers {}

impl Snappers {
    pub fn compress(input: Vec<u8>) -> Vec<u8> {
        let mut encoder = Encoder::new();
        // todo: turn this into a result and map to some
        // exceptions once we have that functionality
        encoder
            .compress_vec(&input)
            .expect("Could not compress input!")
    }

    pub fn decompress(input: Vec<u8>) -> Vec<u8> {
        let mut decoder = Decoder::new();
        // todo: turn this into a result and map to some
        // exceptions once we have that functionality
        decoder
            .decompress_vec(&input)
            .expect("Could not decompress input!")
    }
}
