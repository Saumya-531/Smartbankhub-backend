package com.smartbankhub.exception;

public class ResourceNotFoundException extends SmartBankException {

    public ResourceNotFoundException(String resource, Long id) {
        super(resource + " not found with ID: " + id);
    }
}
