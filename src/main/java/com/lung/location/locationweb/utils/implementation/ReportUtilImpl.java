package com.lung.location.locationweb.utils.implementation;

import com.lung.location.locationweb.utils.ReportUtil;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class ReportUtilImpl implements ReportUtil {
    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        // creating a pie chart dataset instance from jfree charts
        PieDataset dataset = new DefaultPieDataset();
        ChartFactory.createBarChart3D("Location Reports");

    }
}
