package com.lung.location.locationweb.utils.implementation;

import com.lung.location.locationweb.utils.ReportUtil;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.lang.Double.parseDouble;

public class ReportUtilImpl implements ReportUtil {
    @Override
    public void generatePieChart(String path, List<Object[]> data) throws IOException {
        // creating a pie chart dataset instance from jfree charts
        DefaultPieDataset dataset = new DefaultPieDataset();

        // iterating through the list of object
        for (Object[] objects: data){
            try {
                dataset.setValue(objects[0].toString(), parseDouble(objects[1].toString()));
            } catch (NumberFormatException e){
                System.out.println(e);

            }

        }

        // creating a Jfree chart variable
        JFreeChart chart = ChartFactory.createPieChart3D("Location Reports", dataset);

        // setting the format, and orientation of the chart using the chart util
        ChartUtilities.saveChartAsJPEG(new File(path), chart, 350, 350);

    }
}
