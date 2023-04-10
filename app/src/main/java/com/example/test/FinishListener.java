package com.example.test;

/**
 * @ProjectName: TestDemo
 * @Desc:
 * @Author: gao yi ming
 * @Date: 2023/4/10
 */
public interface FinishListener {
    void onActivityFinished();
    void dumpIntermediateCoverage(String filePath);
}