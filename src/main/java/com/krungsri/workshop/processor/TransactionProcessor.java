package com.krungsri.workshop.processor;

import com.krungsri.workshop.model.Transaction;

public interface TransactionProcessor {
    void process(Transaction transaction);
}
