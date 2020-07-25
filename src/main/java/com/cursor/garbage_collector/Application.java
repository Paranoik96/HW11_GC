package com.cursor.garbage_collector;

import com.cursor.garbage_collector.executor.Execute;

public class Application {
    public static void main(String[] args) {
        new Execute().overLoadGarbageCollector();
    }
}
