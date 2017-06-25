package test.com.muquit.libsodiumjna;

/**
 * Test Vectors for libsodium using v1.0.11
 * Auto Generated by gen_test_vectors for libsodium-jna
 * By muquit@muquit.com
 */

public class TestVectors
{
    public static final String PASSWORD_STR = "Correct Horse Battery Staple";
    public static final String MESSAGE_STR = "this is a test";
    public static final byte[] MESSAGE = MESSAGE_STR.getBytes();
    public static final byte[] PASSWORD = PASSWORD_STR.getBytes();

// Password hashing Argon2
    public static final String PWHASH_ARGON2_SALT="adf7da1239a5752d37a0df6111accebe";
    public static final int    PWHASH_ARGON2_SALT_LEN=16;
    public static final String PWHASH_ARGON2_KEY="47a32b7dace756638785c2276f20fbdc8ec34f8d1cccdf2720605c5fc63bb7d5";
    public static final int    PWHASH_ARGON2_KEY_LEN=32;
    public static final String SECRET_BOX_SALT="adf7da1239a5752d37a0df6111accebe";

// Password storage
   public static final String PWHASH_ARGON2_HASHED_PASSWORD="$argon2i$v=19$m=32768,t=4,p=1$Lq2fZ335vKkxxfKyF7Kl4g$U8NIV+STBu40qcSIkiu8jzQgrF9OTS3JnHzcUNHzOxk";

// Password hashing scrypt
    public static final String PWHASH_SCRYPT_SALT="f7b579a1521e1bf251df44edd7cf738869b7a8623ea299c2c14bb7e719f2f584";
    public static final int    PWHASH_SCRYPT_SALT_LEN=32;
    public static final String PWHASH_SCRYPT_KEY="7a26fab6e75a1552c342809ef98f1a1fbb95f87ae0ba18fe039da5995513c0cc";
    public static final int    PWHASH_SCRYPT_KEY_LN=32;

// Secret-key authenticated encryption
    public static final String SECRET_BOX_NONCE="aa89c537cb5ac52431bb30ffe1683db5a1703fec9e2ac50b";
    public static final int    SECRET_BOX_NONCE_LEN=24;
    public static final String SECRET_BOX_KEY="af43bcbea47bcde88280cdf5c19610f89e4f4baadbb779428b67bcb8a878cf3c";
    public static final int    SECRET_BOX_KEY_LEN=32;
    public static final String SECRET_BOX_CIPTHER_TEXT="51ad5da3e8f188c122e35bb74572c7502531c3ea4ea87410d9dea27e674f";
    public static final int    SECRET_BOX_CIPTHER_TEXT_LEN=30;
     public static final String SECRET_BOX_DETACHED_MAC="51ad5da3e8f188c122e35bb74572c750";
     public static final String SECRET_BOX_DETACHED_CIPHER_TEXT="2531c3ea4ea87410d9dea27e674f";
     public static final int    SECRET_BOX_DETACHED_CIPHER_TEXT_LEN=14;
     public static final int    SECRET_BOX_DETACHED_MESSAGE_LEN=14;

// Secret-key authentication verification
   public static final String SECRET_KEY_AUTH_KEY="4bfe7c520c738f27090c0d26c90aa30adc18e9cfa02630396e82e1be21c31feb";
   public static final String SECRET_KEY_AUTH_MAC="67dc7a2ed414d0fa817cca1f02f618a381348bd48073dc6bd14c4eb90853e44c";

// Public-key authenticated encryption
    public static final String CRYPTO_BOX_NONCE="00000000c18a57b700d06db7000000000000000098abe1bf";
    public static final int    CRYPTO_BOX_NONCE_LEN=24;
    public static final String CRYPTO_BOX_BOB_PUBLIC_KEY="cd2a326a0a38ea9ee6a955038b361136f81af109b6ba6e72990d55d7efdb1653";
    public static final String CRYPTO_BOX_BOB_PRIVATE_KEY="48f56925fb36932b568108359997762e8644a219230eea56936c9757a6bdfa7d";
    public static final String CRYPTO_BOX_ALICE_PUBLIC_KEY="afca62cdf90db322879ad39c13c70e7b4c32eb916455fc38bb9a60f39d344d4d";
    public static final String CRYPTO_BOX_ALICE_PRIVATE_KEY="33bc9f6ce3b32441f486100056e84a54b3fab00e0d3648b456c5e449a087f5bf";
    public static final int    CRYPTO_BOX_KEY_LEN=32;
    // Alice Encrypts with Bob's Public Key
    public static final String CRYPTO_BOX_ALICE_CIPHERTEXT="ebccb4da876c45932a47930a305396a64ca6ef61a8ec8c9714996ea58bef";
    // Bob decrypt's with his private Key
    public static final String CRYPTO_BOX_BOB_PLAINTEXT="7468697320697320612074657374";
    public static final int    CRYPTO_BOX_CIPHERTEXT_LEN=30;

// Public-key authenticated encryption
    public static final String SEALBOX_RECIPIENT_PUBLIC_KEY="0120fab44ed4ccf936148436519a82e59cfa3460f00ba1cf712d5ca149e13f40";
    public static final String SEALBOX_RECIPIENT_PRIVATE_KEY="7b7faf0f4d270ccb33b2d37144fd00dad1193b884b921e776968e238471f29cd";
    public static final int    SEALBOX_RECIPIENT_PUBLIC_KEY_LEN=32;
    public static final int    SEALBOX_RECIPIENT_PRIVATE_KEY_LEN=32;
    public static final String SEALBOX_CIPHERTEXT="aba02839df12038318cdacbf99edf0fb5e8bf2421d3a809d962a6b3acf30fa1a66986ebdf8bf00cb0bc1e10e5105007602ed5794a8b75335aca18e8bb382";
    public static final String SEALBOX_DECRYPTEDTEXT="7468697320697320612074657374";
    public static final int    SEALBOX_CIPHERTEXT_LEN=62;
}