package com.example.fintech;

public interface TransferClient {

    TransferClientResponse transfer(TransferRequest request);
}
