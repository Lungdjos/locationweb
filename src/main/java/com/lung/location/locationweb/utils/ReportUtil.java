package com.lung.location.locationweb.utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


public interface ReportUtil {
    void generatePieChart(String path, List<Object []> data) throws IOException;
}
