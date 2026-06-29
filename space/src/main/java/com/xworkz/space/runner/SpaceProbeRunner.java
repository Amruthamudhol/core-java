package com.xworkz.space.runner;
import com.xworkz.space.dto.SpaceProbeDTO;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class SpaceProbeRunner {
    public static void main(String[] args) {

            List<SpaceProbeDTO> list = new ArrayList<>();
            list.add(new SpaceProbeDTO("SP-1", "Mission-1", "Moon", "ISRO", 510.0, LocalDateTime.of(2011, 2, 2, 10, 30), LocalDateTime.of(2013, 2, 2, 11, 45), "Solar Electric", 505.0, "S-Band", 250000.0, 11.0, "Spectrometer", "Radar", 101, false, "Failed", 1.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-2", "Mission-2", "Jupiter", "ESA", 520.0, LocalDateTime.of(2012, 3, 3, 10, 30), LocalDateTime.of(2014, 3, 3, 11, 45), "Ion", 510.0, "Ka-Band", 500000.0, 12.0, "Radar", "Magnetometer", 102, true, "Aborted", 2.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-3", "Mission-3", "Saturn", "JAXA", 530.0, LocalDateTime.of(2013, 4, 4, 10, 30), LocalDateTime.of(2015, 4, 4, 11, 45), "Nuclear", 515.0, "X-Band", 750000.0, 13.0, "Magnetometer", "Camera", 103, false, "In Progress", 3.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-4", "Mission-4", "Venus", "SpaceX", 540.0, LocalDateTime.of(2014, 5, 5, 10, 30), LocalDateTime.of(2016, 5, 5, 11, 45), "Chemical", 520.0, "S-Band", 1000000.0, 14.0, "Camera", "Spectrometer", 104, true, "Success", 4.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-5", "Mission-5", "Pluto", "NASA", 550.0, LocalDateTime.of(2015, 6, 6, 10, 30), LocalDateTime.of(2017, 6, 6, 11, 45), "Solar Electric", 525.0, "Ka-Band", 1250000.0, 15.0, "Spectrometer", "Radar", 105, false, "Failed", 5.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-6", "Mission-6", "Mars", "ISRO", 560.0, LocalDateTime.of(2016, 7, 7, 10, 30), LocalDateTime.of(2018, 7, 7, 11, 45), "Ion", 530.0, "X-Band", 1500000.0, 16.0, "Radar", "Magnetometer", 106, true, "Aborted", 6.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-7", "Mission-7", "Moon", "ESA", 570.0, LocalDateTime.of(2017, 8, 8, 10, 30), LocalDateTime.of(2019, 8, 8, 11, 45), "Nuclear", 535.0, "S-Band", 1750000.0, 17.0, "Magnetometer", "Camera", 107, false, "In Progress", 7.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-8", "Mission-8", "Jupiter", "JAXA", 580.0, LocalDateTime.of(2018, 9, 9, 10, 30), LocalDateTime.of(2020, 9, 9, 11, 45), "Chemical", 540.0, "Ka-Band", 2000000.0, 18.0, "Camera", "Spectrometer", 108, true, "Success", 8.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-9", "Mission-9", "Saturn", "SpaceX", 590.0, LocalDateTime.of(2019, 10, 10, 10, 30), LocalDateTime.of(2021, 10, 10, 11, 45), "Solar Electric", 545.0, "X-Band", 2250000.0, 19.0, "Spectrometer", "Radar", 109, false, "Failed", 9.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-10", "Mission-10", "Venus", "NASA", 600.0, LocalDateTime.of(2020, 11, 11, 10, 30), LocalDateTime.of(2022, 11, 11, 11, 45), "Ion", 550.0, "S-Band", 2500000.0, 20.0, "Radar", "Magnetometer", 110, true, "Aborted", 10.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-11", "Mission-11", "Pluto", "ISRO", 610.0, LocalDateTime.of(2021, 12, 12, 10, 30), LocalDateTime.of(2023, 12, 12, 11, 45), "Nuclear", 555.0, "Ka-Band", 2750000.0, 21.0, "Magnetometer", "Camera", 111, false, "In Progress", 11.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-12", "Mission-12", "Mars", "ESA", 620.0, LocalDateTime.of(2022, 1, 13, 10, 30), LocalDateTime.of(2024, 1, 13, 11, 45), "Chemical", 560.0, "X-Band", 3000000.0, 22.0, "Camera", "Spectrometer", 112, true, "Success", 12.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-13", "Mission-13", "Moon", "JAXA", 630.0, LocalDateTime.of(2023, 2, 14, 10, 30), LocalDateTime.of(2025, 2, 14, 11, 45), "Solar Electric", 565.0, "S-Band", 3250000.0, 23.0, "Spectrometer", "Radar", 113, false, "Failed", 13.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-14", "Mission-14", "Jupiter", "SpaceX", 640.0, LocalDateTime.of(2024, 3, 15, 10, 30), LocalDateTime.of(2026, 3, 15, 11, 45), "Ion", 570.0, "Ka-Band", 3500000.0, 24.0, "Radar", "Magnetometer", 114, true, "Aborted", 14.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-15", "Mission-15", "Saturn", "NASA", 650.0, LocalDateTime.of(2010, 4, 16, 10, 30), LocalDateTime.of(2012, 4, 16, 11, 45), "Nuclear", 575.0, "X-Band", 3750000.0, 25.0, "Magnetometer", "Camera", 115, false, "In Progress", 15.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-16", "Mission-16", "Venus", "ISRO", 660.0, LocalDateTime.of(2011, 5, 17, 10, 30), LocalDateTime.of(2013, 5, 17, 11, 45), "Chemical", 580.0, "S-Band", 4000000.0, 26.0, "Camera", "Spectrometer", 116, true, "Success", 16.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-17", "Mission-17", "Pluto", "ESA", 670.0, LocalDateTime.of(2012, 6, 18, 10, 30), LocalDateTime.of(2014, 6, 18, 11, 45), "Solar Electric", 585.0, "Ka-Band", 4250000.0, 27.0, "Spectrometer", "Radar", 117, false, "Failed", 17.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-18", "Mission-18", "Mars", "JAXA", 680.0, LocalDateTime.of(2013, 7, 19, 10, 30), LocalDateTime.of(2015, 7, 19, 11, 45), "Ion", 590.0, "X-Band", 4500000.0, 28.0, "Radar", "Magnetometer", 118, true, "Aborted", 18.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-19", "Mission-19", "Moon", "SpaceX", 690.0, LocalDateTime.of(2014, 8, 20, 10, 30), LocalDateTime.of(2016, 8, 20, 11, 45), "Nuclear", 595.0, "S-Band", 4750000.0, 29.0, "Magnetometer", "Camera", 119, false, "In Progress", 19.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-20", "Mission-20", "Jupiter", "NASA", 700.0, LocalDateTime.of(2015, 9, 21, 10, 30), LocalDateTime.of(2017, 9, 21, 11, 45), "Chemical", 600.0, "Ka-Band", 5000000.0, 30.0, "Camera", "Spectrometer", 120, true, "Success", 20.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-21", "Mission-21", "Saturn", "ISRO", 710.0, LocalDateTime.of(2016, 10, 22, 10, 30), LocalDateTime.of(2018, 10, 22, 11, 45), "Solar Electric", 605.0, "X-Band", 5250000.0, 31.0, "Spectrometer", "Radar", 121, false, "Failed", 21.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-22", "Mission-22", "Venus", "ESA", 720.0, LocalDateTime.of(2017, 11, 23, 10, 30), LocalDateTime.of(2019, 11, 23, 11, 45), "Ion", 610.0, "S-Band", 5500000.0, 32.0, "Radar", "Magnetometer", 122, true, "Aborted", 22.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-23", "Mission-23", "Pluto", "JAXA", 730.0, LocalDateTime.of(2018, 12, 24, 10, 30), LocalDateTime.of(2020, 12, 24, 11, 45), "Nuclear", 615.0, "Ka-Band", 5750000.0, 33.0, "Magnetometer", "Camera", 123, false, "In Progress", 23.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-24", "Mission-24", "Mars", "SpaceX", 740.0, LocalDateTime.of(2019, 1, 25, 10, 30), LocalDateTime.of(2021, 1, 25, 11, 45), "Chemical", 620.0, "X-Band", 6000000.0, 34.0, "Camera", "Spectrometer", 124, true, "Success", 24.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-25", "Mission-25", "Moon", "NASA", 750.0, LocalDateTime.of(2020, 2, 26, 10, 30), LocalDateTime.of(2022, 2, 26, 11, 45), "Solar Electric", 625.0, "S-Band", 6250000.0, 35.0, "Spectrometer", "Radar", 125, false, "Failed", 25.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-26", "Mission-26", "Jupiter", "ISRO", 760.0, LocalDateTime.of(2021, 3, 27, 10, 30), LocalDateTime.of(2023, 3, 27, 11, 45), "Ion", 630.0, "Ka-Band", 6500000.0, 36.0, "Radar", "Magnetometer", 126, true, "Aborted", 26.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-27", "Mission-27", "Saturn", "ESA", 770.0, LocalDateTime.of(2022, 4, 28, 10, 30), LocalDateTime.of(2024, 4, 28, 11, 45), "Nuclear", 635.0, "X-Band", 6750000.0, 37.0, "Magnetometer", "Camera", 127, false, "In Progress", 27.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-28", "Mission-28", "Venus", "JAXA", 780.0, LocalDateTime.of(2023, 5, 1, 10, 30), LocalDateTime.of(2025, 5, 1, 11, 45), "Chemical", 640.0, "S-Band", 7000000.0, 38.0, "Camera", "Spectrometer", 128, true, "Success", 28.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-29", "Mission-29", "Pluto", "SpaceX", 790.0, LocalDateTime.of(2024, 6, 2, 10, 30), LocalDateTime.of(2026, 6, 2, 11, 45), "Solar Electric", 645.0, "Ka-Band", 7250000.0, 39.0, "Spectrometer", "Radar", 129, false, "Failed", 29.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-30", "Mission-30", "Mars", "NASA", 800.0, LocalDateTime.of(2010, 7, 3, 10, 30), LocalDateTime.of(2012, 7, 3, 11, 45), "Ion", 650.0, "X-Band", 7500000.0, 40.0, "Radar", "Magnetometer", 130, true, "Aborted", 30.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-31", "Mission-31", "Moon", "ISRO", 810.0, LocalDateTime.of(2011, 8, 4, 10, 30), LocalDateTime.of(2013, 8, 4, 11, 45), "Nuclear", 655.0, "S-Band", 7750000.0, 41.0, "Magnetometer", "Camera", 131, false, "In Progress", 31.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-32", "Mission-32", "Jupiter", "ESA", 820.0, LocalDateTime.of(2012, 9, 5, 10, 30), LocalDateTime.of(2014, 9, 5, 11, 45), "Chemical", 660.0, "Ka-Band", 8000000.0, 42.0, "Camera", "Spectrometer", 132, true, "Success", 32.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-33", "Mission-33", "Saturn", "JAXA", 830.0, LocalDateTime.of(2013, 10, 6, 10, 30), LocalDateTime.of(2015, 10, 6, 11, 45), "Solar Electric", 665.0, "X-Band", 8250000.0, 43.0, "Spectrometer", "Radar", 133, false, "Failed", 33.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-34", "Mission-34", "Venus", "SpaceX", 840.0, LocalDateTime.of(2014, 11, 7, 10, 30), LocalDateTime.of(2016, 11, 7, 11, 45), "Ion", 670.0, "S-Band", 8500000.0, 44.0, "Radar", "Magnetometer", 134, true, "Aborted", 34.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-35", "Mission-35", "Pluto", "NASA", 850.0, LocalDateTime.of(2015, 12, 8, 10, 30), LocalDateTime.of(2017, 12, 8, 11, 45), "Nuclear", 675.0, "Ka-Band", 8750000.0, 45.0, "Magnetometer", "Camera", 135, false, "In Progress", 35.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-36", "Mission-36", "Mars", "ISRO", 860.0, LocalDateTime.of(2016, 1, 9, 10, 30), LocalDateTime.of(2018, 1, 9, 11, 45), "Chemical", 680.0, "X-Band", 9000000.0, 46.0, "Camera", "Spectrometer", 136, true, "Success", 36.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-37", "Mission-37", "Moon", "ESA", 870.0, LocalDateTime.of(2017, 2, 10, 10, 30), LocalDateTime.of(2019, 2, 10, 11, 45), "Solar Electric", 685.0, "S-Band", 9250000.0, 47.0, "Spectrometer", "Radar", 137, false, "Failed", 37.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-38", "Mission-38", "Jupiter", "JAXA", 880.0, LocalDateTime.of(2018, 3, 11, 10, 30), LocalDateTime.of(2020, 3, 11, 11, 45), "Ion", 690.0, "Ka-Band", 9500000.0, 48.0, "Radar", "Magnetometer", 138, true, "Aborted", 38.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-39", "Mission-39", "Saturn", "SpaceX", 890.0, LocalDateTime.of(2019, 4, 12, 10, 30), LocalDateTime.of(2021, 4, 12, 11, 45), "Nuclear", 695.0, "X-Band", 9750000.0, 49.0, "Magnetometer", "Camera", 139, false, "In Progress", 39.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-40", "Mission-40", "Venus", "NASA", 900.0, LocalDateTime.of(2020, 5, 13, 10, 30), LocalDateTime.of(2022, 5, 13, 11, 45), "Chemical", 700.0, "S-Band", 10000000.0, 10.0, "Camera", "Spectrometer", 140, true, "Success", 40.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-41", "Mission-41", "Pluto", "ISRO", 910.0, LocalDateTime.of(2021, 6, 14, 10, 30), LocalDateTime.of(2023, 6, 14, 11, 45), "Solar Electric", 705.0, "Ka-Band", 10250000.0, 11.0, "Spectrometer", "Radar", 141, false, "Failed", 41.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-42", "Mission-42", "Mars", "ESA", 920.0, LocalDateTime.of(2022, 7, 15, 10, 30), LocalDateTime.of(2024, 7, 15, 11, 45), "Ion", 710.0, "X-Band", 10500000.0, 12.0, "Radar", "Magnetometer", 142, true, "Aborted", 42.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-43", "Mission-43", "Moon", "JAXA", 930.0, LocalDateTime.of(2023, 8, 16, 10, 30), LocalDateTime.of(2025, 8, 16, 11, 45), "Nuclear", 715.0, "S-Band", 10750000.0, 13.0, "Magnetometer", "Camera", 143, false, "In Progress", 43.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-44", "Mission-44", "Jupiter", "SpaceX", 940.0, LocalDateTime.of(2024, 9, 17, 10, 30), LocalDateTime.of(2026, 9, 17, 11, 45), "Chemical", 720.0, "Ka-Band", 11000000.0, 14.0, "Camera", "Spectrometer", 144, true, "Success", 44.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-45", "Mission-45", "Saturn", "NASA", 950.0, LocalDateTime.of(2010, 10, 18, 10, 30), LocalDateTime.of(2012, 10, 18, 11, 45), "Solar Electric", 725.0, "X-Band", 11250000.0, 15.0, "Spectrometer", "Radar", 145, false, "Failed", 45.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-46", "Mission-46", "Venus", "ISRO", 960.0, LocalDateTime.of(2011, 11, 19, 10, 30), LocalDateTime.of(2013, 11, 19, 11, 45), "Ion", 730.0, "S-Band", 11500000.0, 16.0, "Radar", "Magnetometer", 146, true, "Aborted", 46.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-47", "Mission-47", "Pluto", "ESA", 970.0, LocalDateTime.of(2012, 12, 20, 10, 30), LocalDateTime.of(2014, 12, 20, 11, 45), "Nuclear", 735.0, "Ka-Band", 11750000.0, 17.0, "Magnetometer", "Camera", 147, false, "In Progress", 47.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-48", "Mission-48", "Mars", "JAXA", 980.0, LocalDateTime.of(2013, 1, 21, 10, 30), LocalDateTime.of(2015, 1, 21, 11, 45), "Chemical", 740.0, "X-Band", 12000000.0, 18.0, "Camera", "Spectrometer", 148, true, "Success", 48.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-49", "Mission-49", "Moon", "SpaceX", 990.0, LocalDateTime.of(2014, 2, 22, 10, 30), LocalDateTime.of(2016, 2, 22, 11, 45), "Solar Electric", 745.0, "S-Band", 12250000.0, 19.0, "Spectrometer", "Radar", 149, false, "Failed", 49.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-50", "Mission-50", "Jupiter", "NASA", 1000.0, LocalDateTime.of(2015, 3, 23, 10, 30), LocalDateTime.of(2017, 3, 23, 11, 45), "Ion", 750.0, "Ka-Band", 12500000.0, 20.0, "Radar", "Magnetometer", 150, true, "Aborted", 50.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-51", "Mission-51", "Saturn", "ISRO", 1010.0, LocalDateTime.of(2016, 4, 24, 10, 30), LocalDateTime.of(2018, 4, 24, 11, 45), "Nuclear", 755.0, "X-Band", 12750000.0, 21.0, "Magnetometer", "Camera", 151, false, "In Progress", 51.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-52", "Mission-52", "Venus", "ESA", 1020.0, LocalDateTime.of(2017, 5, 25, 10, 30), LocalDateTime.of(2019, 5, 25, 11, 45), "Chemical", 760.0, "S-Band", 13000000.0, 22.0, "Camera", "Spectrometer", 152, true, "Success", 52.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-53", "Mission-53", "Pluto", "JAXA", 1030.0, LocalDateTime.of(2018, 6, 26, 10, 30), LocalDateTime.of(2020, 6, 26, 11, 45), "Solar Electric", 765.0, "Ka-Band", 13250000.0, 23.0, "Spectrometer", "Radar", 153, false, "Failed", 53.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-54", "Mission-54", "Mars", "SpaceX", 1040.0, LocalDateTime.of(2019, 7, 27, 10, 30), LocalDateTime.of(2021, 7, 27, 11, 45), "Ion", 770.0, "X-Band", 13500000.0, 24.0, "Radar", "Magnetometer", 154, true, "Aborted", 54.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-55", "Mission-55", "Moon", "NASA", 1050.0, LocalDateTime.of(2020, 8, 28, 10, 30), LocalDateTime.of(2022, 8, 28, 11, 45), "Nuclear", 775.0, "S-Band", 13750000.0, 25.0, "Magnetometer", "Camera", 155, false, "In Progress", 55.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-56", "Mission-56", "Jupiter", "ISRO", 1060.0, LocalDateTime.of(2021, 9, 1, 10, 30), LocalDateTime.of(2023, 9, 1, 11, 45), "Chemical", 780.0, "Ka-Band", 14000000.0, 26.0, "Camera", "Spectrometer", 156, true, "Success", 56.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-57", "Mission-57", "Saturn", "ESA", 1070.0, LocalDateTime.of(2022, 10, 2, 10, 30), LocalDateTime.of(2024, 10, 2, 11, 45), "Solar Electric", 785.0, "X-Band", 14250000.0, 27.0, "Spectrometer", "Radar", 157, false, "Failed", 57.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-58", "Mission-58", "Venus", "JAXA", 1080.0, LocalDateTime.of(2023, 11, 3, 10, 30), LocalDateTime.of(2025, 11, 3, 11, 45), "Ion", 790.0, "S-Band", 14500000.0, 28.0, "Radar", "Magnetometer", 158, true, "Aborted", 58.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-59", "Mission-59", "Pluto", "SpaceX", 1090.0, LocalDateTime.of(2024, 12, 4, 10, 30), LocalDateTime.of(2026, 12, 4, 11, 45), "Nuclear", 795.0, "Ka-Band", 14750000.0, 29.0, "Magnetometer", "Camera", 159, false, "In Progress", 59.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-60", "Mission-60", "Mars", "NASA", 1100.0, LocalDateTime.of(2010, 1, 5, 10, 30), LocalDateTime.of(2012, 1, 5, 11, 45), "Chemical", 800.0, "X-Band", 15000000.0, 30.0, "Camera", "Spectrometer", 160, true, "Success", 60.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-61", "Mission-61", "Moon", "ISRO", 1110.0, LocalDateTime.of(2011, 2, 6, 10, 30), LocalDateTime.of(2013, 2, 6, 11, 45), "Solar Electric", 805.0, "S-Band", 15250000.0, 31.0, "Spectrometer", "Radar", 161, false, "Failed", 61.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-62", "Mission-62", "Jupiter", "ESA", 1120.0, LocalDateTime.of(2012, 3, 7, 10, 30), LocalDateTime.of(2014, 3, 7, 11, 45), "Ion", 810.0, "Ka-Band", 15500000.0, 32.0, "Radar", "Magnetometer", 162, true, "Aborted", 62.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-63", "Mission-63", "Saturn", "JAXA", 1130.0, LocalDateTime.of(2013, 4, 8, 10, 30), LocalDateTime.of(2015, 4, 8, 11, 45), "Nuclear", 815.0, "X-Band", 15750000.0, 33.0, "Magnetometer", "Camera", 163, false, "In Progress", 63.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-64", "Mission-64", "Venus", "SpaceX", 1140.0, LocalDateTime.of(2014, 5, 9, 10, 30), LocalDateTime.of(2016, 5, 9, 11, 45), "Chemical", 820.0, "S-Band", 16000000.0, 34.0, "Camera", "Spectrometer", 164, true, "Success", 64.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-65", "Mission-65", "Pluto", "NASA", 1150.0, LocalDateTime.of(2015, 6, 10, 10, 30), LocalDateTime.of(2017, 6, 10, 11, 45), "Solar Electric", 825.0, "Ka-Band", 16250000.0, 35.0, "Spectrometer", "Radar", 165, false, "Failed", 65.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-66", "Mission-66", "Mars", "ISRO", 1160.0, LocalDateTime.of(2016, 7, 11, 10, 30), LocalDateTime.of(2018, 7, 11, 11, 45), "Ion", 830.0, "X-Band", 16500000.0, 36.0, "Radar", "Magnetometer", 166, true, "Aborted", 66.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-67", "Mission-67", "Moon", "ESA", 1170.0, LocalDateTime.of(2017, 8, 12, 10, 30), LocalDateTime.of(2019, 8, 12, 11, 45), "Nuclear", 835.0, "S-Band", 16750000.0, 37.0, "Magnetometer", "Camera", 167, false, "In Progress", 67.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-68", "Mission-68", "Jupiter", "JAXA", 1180.0, LocalDateTime.of(2018, 9, 13, 10, 30), LocalDateTime.of(2020, 9, 13, 11, 45), "Chemical", 840.0, "Ka-Band", 17000000.0, 38.0, "Camera", "Spectrometer", 168, true, "Success", 68.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-69", "Mission-69", "Saturn", "SpaceX", 1190.0, LocalDateTime.of(2019, 10, 14, 10, 30), LocalDateTime.of(2021, 10, 14, 11, 45), "Solar Electric", 845.0, "X-Band", 17250000.0, 39.0, "Spectrometer", "Radar", 169, false, "Failed", 69.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-70", "Mission-70", "Venus", "NASA", 1200.0, LocalDateTime.of(2020, 11, 15, 10, 30), LocalDateTime.of(2022, 11, 15, 11, 45), "Ion", 850.0, "S-Band", 17500000.0, 40.0, "Radar", "Magnetometer", 170, true, "Aborted", 70.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-71", "Mission-71", "Pluto", "ISRO", 1210.0, LocalDateTime.of(2021, 12, 16, 10, 30), LocalDateTime.of(2023, 12, 16, 11, 45), "Nuclear", 855.0, "Ka-Band", 17750000.0, 41.0, "Magnetometer", "Camera", 171, false, "In Progress", 71.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-72", "Mission-72", "Mars", "ESA", 1220.0, LocalDateTime.of(2022, 1, 17, 10, 30), LocalDateTime.of(2024, 1, 17, 11, 45), "Chemical", 860.0, "X-Band", 18000000.0, 42.0, "Camera", "Spectrometer", 172, true, "Success", 72.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-73", "Mission-73", "Moon", "JAXA", 1230.0, LocalDateTime.of(2023, 2, 18, 10, 30), LocalDateTime.of(2025, 2, 18, 11, 45), "Solar Electric", 865.0, "S-Band", 18250000.0, 43.0, "Spectrometer", "Radar", 173, false, "Failed", 73.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-74", "Mission-74", "Jupiter", "SpaceX", 1240.0, LocalDateTime.of(2024, 3, 19, 10, 30), LocalDateTime.of(2026, 3, 19, 11, 45), "Ion", 870.0, "Ka-Band", 18500000.0, 44.0, "Radar", "Magnetometer", 174, true, "Aborted", 74.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-75", "Mission-75", "Saturn", "NASA", 1250.0, LocalDateTime.of(2010, 4, 20, 10, 30), LocalDateTime.of(2012, 4, 20, 11, 45), "Nuclear", 875.0, "X-Band", 18750000.0, 45.0, "Magnetometer", "Camera", 175, false, "In Progress", 75.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-76", "Mission-76", "Venus", "ISRO", 1260.0, LocalDateTime.of(2011, 5, 21, 10, 30), LocalDateTime.of(2013, 5, 21, 11, 45), "Chemical", 880.0, "S-Band", 19000000.0, 46.0, "Camera", "Spectrometer", 176, true, "Success", 76.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-77", "Mission-77", "Pluto", "ESA", 1270.0, LocalDateTime.of(2012, 6, 22, 10, 30), LocalDateTime.of(2014, 6, 22, 11, 45), "Solar Electric", 885.0, "Ka-Band", 19250000.0, 47.0, "Spectrometer", "Radar", 177, false, "Failed", 77.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-78", "Mission-78", "Mars", "JAXA", 1280.0, LocalDateTime.of(2013, 7, 23, 10, 30), LocalDateTime.of(2015, 7, 23, 11, 45), "Ion", 890.0, "X-Band", 19500000.0, 48.0, "Radar", "Magnetometer", 178, true, "Aborted", 78.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-79", "Mission-79", "Moon", "SpaceX", 1290.0, LocalDateTime.of(2014, 8, 24, 10, 30), LocalDateTime.of(2016, 8, 24, 11, 45), "Nuclear", 895.0, "S-Band", 19750000.0, 49.0, "Magnetometer", "Camera", 179, false, "In Progress", 79.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-80", "Mission-80", "Jupiter", "NASA", 1300.0, LocalDateTime.of(2015, 9, 25, 10, 30), LocalDateTime.of(2017, 9, 25, 11, 45), "Chemical", 900.0, "Ka-Band", 20000000.0, 10.0, "Camera", "Spectrometer", 180, true, "Success", 80.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-81", "Mission-81", "Saturn", "ISRO", 1310.0, LocalDateTime.of(2016, 10, 26, 10, 30), LocalDateTime.of(2018, 10, 26, 11, 45), "Solar Electric", 905.0, "X-Band", 20250000.0, 11.0, "Spectrometer", "Radar", 181, false, "Failed", 81.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-82", "Mission-82", "Venus", "ESA", 1320.0, LocalDateTime.of(2017, 11, 27, 10, 30), LocalDateTime.of(2019, 11, 27, 11, 45), "Ion", 910.0, "S-Band", 20500000.0, 12.0, "Radar", "Magnetometer", 182, true, "Aborted", 82.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-83", "Mission-83", "Pluto", "JAXA", 1330.0, LocalDateTime.of(2018, 12, 28, 10, 30), LocalDateTime.of(2020, 12, 28, 11, 45), "Nuclear", 915.0, "Ka-Band", 20750000.0, 13.0, "Magnetometer", "Camera", 183, false, "In Progress", 83.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-84", "Mission-84", "Mars", "SpaceX", 1340.0, LocalDateTime.of(2019, 1, 1, 10, 30), LocalDateTime.of(2021, 1, 1, 11, 45), "Chemical", 920.0, "X-Band", 21000000.0, 14.0, "Camera", "Spectrometer", 184, true, "Success", 84.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-85", "Mission-85", "Moon", "NASA", 1350.0, LocalDateTime.of(2020, 2, 2, 10, 30), LocalDateTime.of(2022, 2, 2, 11, 45), "Solar Electric", 925.0, "S-Band", 21250000.0, 15.0, "Spectrometer", "Radar", 185, false, "Failed", 85.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-86", "Mission-86", "Jupiter", "ISRO", 1360.0, LocalDateTime.of(2021, 3, 3, 10, 30), LocalDateTime.of(2023, 3, 3, 11, 45), "Ion", 930.0, "Ka-Band", 21500000.0, 16.0, "Radar", "Magnetometer", 186, true, "Aborted", 86.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-87", "Mission-87", "Saturn", "ESA", 1370.0, LocalDateTime.of(2022, 4, 4, 10, 30), LocalDateTime.of(2024, 4, 4, 11, 45), "Nuclear", 935.0, "X-Band", 21750000.0, 17.0, "Magnetometer", "Camera", 187, false, "In Progress", 87.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-88", "Mission-88", "Venus", "JAXA", 1380.0, LocalDateTime.of(2023, 5, 5, 10, 30), LocalDateTime.of(2025, 5, 5, 11, 45), "Chemical", 940.0, "S-Band", 22000000.0, 18.0, "Camera", "Spectrometer", 188, true, "Success", 88.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-89", "Mission-89", "Pluto", "SpaceX", 1390.0, LocalDateTime.of(2024, 6, 6, 10, 30), LocalDateTime.of(2026, 6, 6, 11, 45), "Solar Electric", 945.0, "Ka-Band", 22250000.0, 19.0, "Spectrometer", "Radar", 189, false, "Failed", 89.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-90", "Mission-90", "Mars", "NASA", 1400.0, LocalDateTime.of(2010, 7, 7, 10, 30), LocalDateTime.of(2012, 7, 7, 11, 45), "Ion", 950.0, "X-Band", 22500000.0, 20.0, "Radar", "Magnetometer", 190, true, "Aborted", 90.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-91", "Mission-91", "Moon", "ISRO", 1410.0, LocalDateTime.of(2011, 8, 8, 10, 30), LocalDateTime.of(2013, 8, 8, 11, 45), "Nuclear", 955.0, "S-Band", 22750000.0, 21.0, "Magnetometer", "Camera", 191, false, "In Progress", 91.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-92", "Mission-92", "Jupiter", "ESA", 1420.0, LocalDateTime.of(2012, 9, 9, 10, 30), LocalDateTime.of(2014, 9, 9, 11, 45), "Chemical", 960.0, "Ka-Band", 23000000.0, 22.0, "Camera", "Spectrometer", 192, true, "Success", 92.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-93", "Mission-93", "Saturn", "JAXA", 1430.0, LocalDateTime.of(2013, 10, 10, 10, 30), LocalDateTime.of(2015, 10, 10, 11, 45), "Solar Electric", 965.0, "X-Band", 23250000.0, 23.0, "Spectrometer", "Radar", 193, false, "Failed", 93.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-94", "Mission-94", "Venus", "SpaceX", 1440.0, LocalDateTime.of(2014, 11, 11, 10, 30), LocalDateTime.of(2016, 11, 11, 11, 45), "Ion", 970.0, "S-Band", 23500000.0, 24.0, "Radar", "Magnetometer", 194, true, "Aborted", 94.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-95", "Mission-95", "Pluto", "NASA", 1450.0, LocalDateTime.of(2015, 12, 12, 10, 30), LocalDateTime.of(2017, 12, 12, 11, 45), "Nuclear", 975.0, "Ka-Band", 23750000.0, 25.0, "Magnetometer", "Camera", 195, false, "In Progress", 95.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-96", "Mission-96", "Mars", "ISRO", 1460.0, LocalDateTime.of(2016, 1, 13, 10, 30), LocalDateTime.of(2018, 1, 13, 11, 45), "Chemical", 980.0, "X-Band", 24000000.0, 26.0, "Camera", "Spectrometer", 196, true, "Success", 96.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-97", "Mission-97", "Moon", "ESA", 1470.0, LocalDateTime.of(2017, 2, 14, 10, 30), LocalDateTime.of(2019, 2, 14, 11, 45), "Solar Electric", 985.0, "S-Band", 24250000.0, 27.0, "Spectrometer", "Radar", 197, false, "Failed", 97.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-98", "Mission-98", "Jupiter", "JAXA", 1480.0, LocalDateTime.of(2018, 3, 15, 10, 30), LocalDateTime.of(2020, 3, 15, 11, 45), "Ion", 990.0, "Ka-Band", 24500000.0, 28.0, "Radar", "Magnetometer", 198, true, "Aborted", 98.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-99", "Mission-99", "Saturn", "SpaceX", 1490.0, LocalDateTime.of(2019, 4, 16, 10, 30), LocalDateTime.of(2021, 4, 16, 11, 45), "Nuclear", 995.0, "X-Band", 24750000.0, 29.0, "Magnetometer", "Camera", 199, false, "In Progress", 99.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-100", "Mission-100", "Venus", "NASA", 1500.0, LocalDateTime.of(2020, 5, 17, 10, 30), LocalDateTime.of(2022, 5, 17, 11, 45), "Chemical", 1000.0, "S-Band", 25000000.0, 30.0, "Camera", "Spectrometer", 200, true, "Success", 0.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-101", "Mission-101", "Pluto", "ISRO", 1510.0, LocalDateTime.of(2021, 6, 18, 10, 30), LocalDateTime.of(2023, 6, 18, 11, 45), "Solar Electric", 1005.0, "Ka-Band", 25250000.0, 31.0, "Spectrometer", "Radar", 201, false, "Failed", 1.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-102", "Mission-102", "Mars", "ESA", 1520.0, LocalDateTime.of(2022, 7, 19, 10, 30), LocalDateTime.of(2024, 7, 19, 11, 45), "Ion", 1010.0, "X-Band", 25500000.0, 32.0, "Radar", "Magnetometer", 202, true, "Aborted", 2.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-103", "Mission-103", "Moon", "JAXA", 1530.0, LocalDateTime.of(2023, 8, 20, 10, 30), LocalDateTime.of(2025, 8, 20, 11, 45), "Nuclear", 1015.0, "S-Band", 25750000.0, 33.0, "Magnetometer", "Camera", 203, false, "In Progress", 3.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-104", "Mission-104", "Jupiter", "SpaceX", 1540.0, LocalDateTime.of(2024, 9, 21, 10, 30), LocalDateTime.of(2026, 9, 21, 11, 45), "Chemical", 1020.0, "Ka-Band", 26000000.0, 34.0, "Camera", "Spectrometer", 204, true, "Success", 4.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-105", "Mission-105", "Saturn", "NASA", 1550.0, LocalDateTime.of(2010, 10, 22, 10, 30), LocalDateTime.of(2012, 10, 22, 11, 45), "Solar Electric", 1025.0, "X-Band", 26250000.0, 35.0, "Spectrometer", "Radar", 205, false, "Failed", 5.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-106", "Mission-106", "Venus", "ISRO", 1560.0, LocalDateTime.of(2011, 11, 23, 10, 30), LocalDateTime.of(2013, 11, 23, 11, 45), "Ion", 1030.0, "S-Band", 26500000.0, 36.0, "Radar", "Magnetometer", 206, true, "Aborted", 6.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-107", "Mission-107", "Pluto", "ESA", 1570.0, LocalDateTime.of(2012, 12, 24, 10, 30), LocalDateTime.of(2014, 12, 24, 11, 45), "Nuclear", 1035.0, "Ka-Band", 26750000.0, 37.0, "Magnetometer", "Camera", 207, false, "In Progress", 7.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-108", "Mission-108", "Mars", "JAXA", 1580.0, LocalDateTime.of(2013, 1, 25, 10, 30), LocalDateTime.of(2015, 1, 25, 11, 45), "Chemical", 1040.0, "X-Band", 27000000.0, 38.0, "Camera", "Spectrometer", 208, true, "Success", 8.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-109", "Mission-109", "Moon", "SpaceX", 1590.0, LocalDateTime.of(2014, 2, 26, 10, 30), LocalDateTime.of(2016, 2, 26, 11, 45), "Solar Electric", 1045.0, "S-Band", 27250000.0, 39.0, "Spectrometer", "Radar", 209, false, "Failed", 9.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-110", "Mission-110", "Jupiter", "NASA", 1600.0, LocalDateTime.of(2015, 3, 27, 10, 30), LocalDateTime.of(2017, 3, 27, 11, 45), "Ion", 1050.0, "Ka-Band", 27500000.0, 40.0, "Radar", "Magnetometer", 210, true, "Aborted", 10.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-111", "Mission-111", "Saturn", "ISRO", 1610.0, LocalDateTime.of(2016, 4, 28, 10, 30), LocalDateTime.of(2018, 4, 28, 11, 45), "Nuclear", 1055.0, "X-Band", 27750000.0, 41.0, "Magnetometer", "Camera", 211, false, "In Progress", 11.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-112", "Mission-112", "Venus", "ESA", 1620.0, LocalDateTime.of(2017, 5, 1, 10, 30), LocalDateTime.of(2019, 5, 1, 11, 45), "Chemical", 1060.0, "S-Band", 28000000.0, 42.0, "Camera", "Spectrometer", 212, true, "Success", 12.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-113", "Mission-113", "Pluto", "JAXA", 1630.0, LocalDateTime.of(2018, 6, 2, 10, 30), LocalDateTime.of(2020, 6, 2, 11, 45), "Solar Electric", 1065.0, "Ka-Band", 28250000.0, 43.0, "Spectrometer", "Radar", 213, false, "Failed", 13.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-114", "Mission-114", "Mars", "SpaceX", 1640.0, LocalDateTime.of(2019, 7, 3, 10, 30), LocalDateTime.of(2021, 7, 3, 11, 45), "Ion", 1070.0, "X-Band", 28500000.0, 44.0, "Radar", "Magnetometer", 214, true, "Aborted", 14.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-115", "Mission-115", "Moon", "NASA", 1650.0, LocalDateTime.of(2020, 8, 4, 10, 30), LocalDateTime.of(2022, 8, 4, 11, 45), "Nuclear", 1075.0, "S-Band", 28750000.0, 45.0, "Magnetometer", "Camera", 215, false, "In Progress", 15.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-116", "Mission-116", "Jupiter", "ISRO", 1660.0, LocalDateTime.of(2021, 9, 5, 10, 30), LocalDateTime.of(2023, 9, 5, 11, 45), "Chemical", 1080.0, "Ka-Band", 29000000.0, 46.0, "Camera", "Spectrometer", 216, true, "Success", 16.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-117", "Mission-117", "Saturn", "ESA", 1670.0, LocalDateTime.of(2022, 10, 6, 10, 30), LocalDateTime.of(2024, 10, 6, 11, 45), "Solar Electric", 1085.0, "X-Band", 29250000.0, 47.0, "Spectrometer", "Radar", 217, false, "Failed", 17.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-118", "Mission-118", "Venus", "JAXA", 1680.0, LocalDateTime.of(2023, 11, 7, 10, 30), LocalDateTime.of(2025, 11, 7, 11, 45), "Ion", 1090.0, "S-Band", 29500000.0, 48.0, "Radar", "Magnetometer", 218, true, "Aborted", 18.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-119", "Mission-119", "Pluto", "SpaceX", 1690.0, LocalDateTime.of(2024, 12, 8, 10, 30), LocalDateTime.of(2026, 12, 8, 11, 45), "Nuclear", 1095.0, "Ka-Band", 29750000.0, 49.0, "Magnetometer", "Camera", 219, false, "In Progress", 19.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-120", "Mission-120", "Mars", "NASA", 1700.0, LocalDateTime.of(2010, 1, 9, 10, 30), LocalDateTime.of(2012, 1, 9, 11, 45), "Chemical", 1100.0, "X-Band", 30000000.0, 10.0, "Camera", "Spectrometer", 220, true, "Success", 20.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-121", "Mission-121", "Moon", "ISRO", 1710.0, LocalDateTime.of(2011, 2, 10, 10, 30), LocalDateTime.of(2013, 2, 10, 11, 45), "Solar Electric", 1105.0, "S-Band", 30250000.0, 11.0, "Spectrometer", "Radar", 221, false, "Failed", 21.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-122", "Mission-122", "Jupiter", "ESA", 1720.0, LocalDateTime.of(2012, 3, 11, 10, 30), LocalDateTime.of(2014, 3, 11, 11, 45), "Ion", 1110.0, "Ka-Band", 30500000.0, 12.0, "Radar", "Magnetometer", 222, true, "Aborted", 22.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-123", "Mission-123", "Saturn", "JAXA", 1730.0, LocalDateTime.of(2013, 4, 12, 10, 30), LocalDateTime.of(2015, 4, 12, 11, 45), "Nuclear", 1115.0, "X-Band", 30750000.0, 13.0, "Magnetometer", "Camera", 223, false, "In Progress", 23.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-124", "Mission-124", "Venus", "SpaceX", 1740.0, LocalDateTime.of(2014, 5, 13, 10, 30), LocalDateTime.of(2016, 5, 13, 11, 45), "Chemical", 1120.0, "S-Band", 31000000.0, 14.0, "Camera", "Spectrometer", 224, true, "Success", 24.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-125", "Mission-125", "Pluto", "NASA", 1750.0, LocalDateTime.of(2015, 6, 14, 10, 30), LocalDateTime.of(2017, 6, 14, 11, 45), "Solar Electric", 1125.0, "Ka-Band", 31250000.0, 15.0, "Spectrometer", "Radar", 225, false, "Failed", 25.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-126", "Mission-126", "Mars", "ISRO", 1760.0, LocalDateTime.of(2016, 7, 15, 10, 30), LocalDateTime.of(2018, 7, 15, 11, 45), "Ion", 1130.0, "X-Band", 31500000.0, 16.0, "Radar", "Magnetometer", 226, true, "Aborted", 26.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-127", "Mission-127", "Moon", "ESA", 1770.0, LocalDateTime.of(2017, 8, 16, 10, 30), LocalDateTime.of(2019, 8, 16, 11, 45), "Nuclear", 1135.0, "S-Band", 31750000.0, 17.0, "Magnetometer", "Camera", 227, false, "In Progress", 27.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-128", "Mission-128", "Jupiter", "JAXA", 1780.0, LocalDateTime.of(2018, 9, 17, 10, 30), LocalDateTime.of(2020, 9, 17, 11, 45), "Chemical", 1140.0, "Ka-Band", 32000000.0, 18.0, "Camera", "Spectrometer", 228, true, "Success", 28.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-129", "Mission-129", "Saturn", "SpaceX", 1790.0, LocalDateTime.of(2019, 10, 18, 10, 30), LocalDateTime.of(2021, 10, 18, 11, 45), "Solar Electric", 1145.0, "X-Band", 32250000.0, 19.0, "Spectrometer", "Radar", 229, false, "Failed", 29.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-130", "Mission-130", "Venus", "NASA", 1800.0, LocalDateTime.of(2020, 11, 19, 10, 30), LocalDateTime.of(2022, 11, 19, 11, 45), "Ion", 1150.0, "S-Band", 32500000.0, 20.0, "Radar", "Magnetometer", 230, true, "Aborted", 30.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-131", "Mission-131", "Pluto", "ISRO", 1810.0, LocalDateTime.of(2021, 12, 20, 10, 30), LocalDateTime.of(2023, 12, 20, 11, 45), "Nuclear", 1155.0, "Ka-Band", 32750000.0, 21.0, "Magnetometer", "Camera", 231, false, "In Progress", 31.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-132", "Mission-132", "Mars", "ESA", 1820.0, LocalDateTime.of(2022, 1, 21, 10, 30), LocalDateTime.of(2024, 1, 21, 11, 45), "Chemical", 1160.0, "X-Band", 33000000.0, 22.0, "Camera", "Spectrometer", 232, true, "Success", 32.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-133", "Mission-133", "Moon", "JAXA", 1830.0, LocalDateTime.of(2023, 2, 22, 10, 30), LocalDateTime.of(2025, 2, 22, 11, 45), "Solar Electric", 1165.0, "S-Band", 33250000.0, 23.0, "Spectrometer", "Radar", 233, false, "Failed", 33.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-134", "Mission-134", "Jupiter", "SpaceX", 1840.0, LocalDateTime.of(2024, 3, 23, 10, 30), LocalDateTime.of(2026, 3, 23, 11, 45), "Ion", 1170.0, "Ka-Band", 33500000.0, 24.0, "Radar", "Magnetometer", 234, true, "Aborted", 34.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-135", "Mission-135", "Saturn", "NASA", 1850.0, LocalDateTime.of(2010, 4, 24, 10, 30), LocalDateTime.of(2012, 4, 24, 11, 45), "Nuclear", 1175.0, "X-Band", 33750000.0, 25.0, "Magnetometer", "Camera", 235, false, "In Progress", 35.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-136", "Mission-136", "Venus", "ISRO", 1860.0, LocalDateTime.of(2011, 5, 25, 10, 30), LocalDateTime.of(2013, 5, 25, 11, 45), "Chemical", 1180.0, "S-Band", 34000000.0, 26.0, "Camera", "Spectrometer", 236, true, "Success", 36.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-137", "Mission-137", "Pluto", "ESA", 1870.0, LocalDateTime.of(2012, 6, 26, 10, 30), LocalDateTime.of(2014, 6, 26, 11, 45), "Solar Electric", 1185.0, "Ka-Band", 34250000.0, 27.0, "Spectrometer", "Radar", 237, false, "Failed", 37.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-138", "Mission-138", "Mars", "JAXA", 1880.0, LocalDateTime.of(2013, 7, 27, 10, 30), LocalDateTime.of(2015, 7, 27, 11, 45), "Ion", 1190.0, "X-Band", 34500000.0, 28.0, "Radar", "Magnetometer", 238, true, "Aborted", 38.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-139", "Mission-139", "Moon", "SpaceX", 1890.0, LocalDateTime.of(2014, 8, 28, 10, 30), LocalDateTime.of(2016, 8, 28, 11, 45), "Nuclear", 1195.0, "S-Band", 34750000.0, 29.0, "Magnetometer", "Camera", 239, false, "In Progress", 39.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-140", "Mission-140", "Jupiter", "NASA", 1900.0, LocalDateTime.of(2015, 9, 1, 10, 30), LocalDateTime.of(2017, 9, 1, 11, 45), "Chemical", 1200.0, "Ka-Band", 35000000.0, 30.0, "Camera", "Spectrometer", 240, true, "Success", 40.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-141", "Mission-141", "Saturn", "ISRO", 1910.0, LocalDateTime.of(2016, 10, 2, 10, 30), LocalDateTime.of(2018, 10, 2, 11, 45), "Solar Electric", 1205.0, "X-Band", 35250000.0, 31.0, "Spectrometer", "Radar", 241, false, "Failed", 41.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-142", "Mission-142", "Venus", "ESA", 1920.0, LocalDateTime.of(2017, 11, 3, 10, 30), LocalDateTime.of(2019, 11, 3, 11, 45), "Ion", 1210.0, "S-Band", 35500000.0, 32.0, "Radar", "Magnetometer", 242, true, "Aborted", 42.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-143", "Mission-143", "Pluto", "JAXA", 1930.0, LocalDateTime.of(2018, 12, 4, 10, 30), LocalDateTime.of(2020, 12, 4, 11, 45), "Nuclear", 1215.0, "Ka-Band", 35750000.0, 33.0, "Magnetometer", "Camera", 243, false, "In Progress", 43.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-144", "Mission-144", "Mars", "SpaceX", 1940.0, LocalDateTime.of(2019, 1, 5, 10, 30), LocalDateTime.of(2021, 1, 5, 11, 45), "Chemical", 1220.0, "X-Band", 36000000.0, 34.0, "Camera", "Spectrometer", 244, true, "Success", 44.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-145", "Mission-145", "Moon", "NASA", 1950.0, LocalDateTime.of(2020, 2, 6, 10, 30), LocalDateTime.of(2022, 2, 6, 11, 45), "Solar Electric", 1225.0, "S-Band", 36250000.0, 35.0, "Spectrometer", "Radar", 245, false, "Failed", 45.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-146", "Mission-146", "Jupiter", "ISRO", 1960.0, LocalDateTime.of(2021, 3, 7, 10, 30), LocalDateTime.of(2023, 3, 7, 11, 45), "Ion", 1230.0, "Ka-Band", 36500000.0, 36.0, "Radar", "Magnetometer", 246, true, "Aborted", 46.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-147", "Mission-147", "Saturn", "ESA", 1970.0, LocalDateTime.of(2022, 4, 8, 10, 30), LocalDateTime.of(2024, 4, 8, 11, 45), "Nuclear", 1235.0, "X-Band", 36750000.0, 37.0, "Magnetometer", "Camera", 247, false, "In Progress", 47.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-148", "Mission-148", "Venus", "JAXA", 1980.0, LocalDateTime.of(2023, 5, 9, 10, 30), LocalDateTime.of(2025, 5, 9, 11, 45), "Chemical", 1240.0, "S-Band", 37000000.0, 38.0, "Camera", "Spectrometer", 248, true, "Success", 48.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-149", "Mission-149", "Pluto", "SpaceX", 1990.0, LocalDateTime.of(2024, 6, 10, 10, 30), LocalDateTime.of(2026, 6, 10, 11, 45), "Solar Electric", 1245.0, "Ka-Band", 37250000.0, 39.0, "Spectrometer", "Radar", 249, false, "Failed", 49.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-150", "Mission-150", "Mars", "NASA", 2000.0, LocalDateTime.of(2010, 7, 11, 10, 30), LocalDateTime.of(2012, 7, 11, 11, 45), "Ion", 1250.0, "X-Band", 37500000.0, 40.0, "Radar", "Magnetometer", 250, true, "Aborted", 50.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-151", "Mission-151", "Moon", "ISRO", 2010.0, LocalDateTime.of(2011, 8, 12, 10, 30), LocalDateTime.of(2013, 8, 12, 11, 45), "Nuclear", 1255.0, "S-Band", 37750000.0, 41.0, "Magnetometer", "Camera", 251, false, "In Progress", 51.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-152", "Mission-152", "Jupiter", "ESA", 2020.0, LocalDateTime.of(2012, 9, 13, 10, 30), LocalDateTime.of(2014, 9, 13, 11, 45), "Chemical", 1260.0, "Ka-Band", 38000000.0, 42.0, "Camera", "Spectrometer", 252, true, "Success", 52.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-153", "Mission-153", "Saturn", "JAXA", 2030.0, LocalDateTime.of(2013, 10, 14, 10, 30), LocalDateTime.of(2015, 10, 14, 11, 45), "Solar Electric", 1265.0, "X-Band", 38250000.0, 43.0, "Spectrometer", "Radar", 253, false, "Failed", 53.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-154", "Mission-154", "Venus", "SpaceX", 2040.0, LocalDateTime.of(2014, 11, 15, 10, 30), LocalDateTime.of(2016, 11, 15, 11, 45), "Ion", 1270.0, "S-Band", 38500000.0, 44.0, "Radar", "Magnetometer", 254, true, "Aborted", 54.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-155", "Mission-155", "Pluto", "NASA", 2050.0, LocalDateTime.of(2015, 12, 16, 10, 30), LocalDateTime.of(2017, 12, 16, 11, 45), "Nuclear", 1275.0, "Ka-Band", 38750000.0, 45.0, "Magnetometer", "Camera", 255, false, "In Progress", 55.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-156", "Mission-156", "Mars", "ISRO", 2060.0, LocalDateTime.of(2016, 1, 17, 10, 30), LocalDateTime.of(2018, 1, 17, 11, 45), "Chemical", 1280.0, "X-Band", 39000000.0, 46.0, "Camera", "Spectrometer", 256, true, "Success", 56.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-157", "Mission-157", "Moon", "ESA", 2070.0, LocalDateTime.of(2017, 2, 18, 10, 30), LocalDateTime.of(2019, 2, 18, 11, 45), "Solar Electric", 1285.0, "S-Band", 39250000.0, 47.0, "Spectrometer", "Radar", 257, false, "Failed", 57.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-158", "Mission-158", "Jupiter", "JAXA", 2080.0, LocalDateTime.of(2018, 3, 19, 10, 30), LocalDateTime.of(2020, 3, 19, 11, 45), "Ion", 1290.0, "Ka-Band", 39500000.0, 48.0, "Radar", "Magnetometer", 258, true, "Aborted", 58.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-159", "Mission-159", "Saturn", "SpaceX", 2090.0, LocalDateTime.of(2019, 4, 20, 10, 30), LocalDateTime.of(2021, 4, 20, 11, 45), "Nuclear", 1295.0, "X-Band", 39750000.0, 49.0, "Magnetometer", "Camera", 259, false, "In Progress", 59.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-160", "Mission-160", "Venus", "NASA", 2100.0, LocalDateTime.of(2020, 5, 21, 10, 30), LocalDateTime.of(2022, 5, 21, 11, 45), "Chemical", 1300.0, "S-Band", 40000000.0, 10.0, "Camera", "Spectrometer", 260, true, "Success", 60.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-161", "Mission-161", "Pluto", "ISRO", 2110.0, LocalDateTime.of(2021, 6, 22, 10, 30), LocalDateTime.of(2023, 6, 22, 11, 45), "Solar Electric", 1305.0, "Ka-Band", 40250000.0, 11.0, "Spectrometer", "Radar", 261, false, "Failed", 61.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-162", "Mission-162", "Mars", "ESA", 2120.0, LocalDateTime.of(2022, 7, 23, 10, 30), LocalDateTime.of(2024, 7, 23, 11, 45), "Ion", 1310.0, "X-Band", 40500000.0, 12.0, "Radar", "Magnetometer", 262, true, "Aborted", 62.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-163", "Mission-163", "Moon", "JAXA", 2130.0, LocalDateTime.of(2023, 8, 24, 10, 30), LocalDateTime.of(2025, 8, 24, 11, 45), "Nuclear", 1315.0, "S-Band", 40750000.0, 13.0, "Magnetometer", "Camera", 263, false, "In Progress", 63.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-164", "Mission-164", "Jupiter", "SpaceX", 2140.0, LocalDateTime.of(2024, 9, 25, 10, 30), LocalDateTime.of(2026, 9, 25, 11, 45), "Chemical", 1320.0, "Ka-Band", 41000000.0, 14.0, "Camera", "Spectrometer", 264, true, "Success", 64.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-165", "Mission-165", "Saturn", "NASA", 2150.0, LocalDateTime.of(2010, 10, 26, 10, 30), LocalDateTime.of(2012, 10, 26, 11, 45), "Solar Electric", 1325.0, "X-Band", 41250000.0, 15.0, "Spectrometer", "Radar", 265, false, "Failed", 65.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-166", "Mission-166", "Venus", "ISRO", 2160.0, LocalDateTime.of(2011, 11, 27, 10, 30), LocalDateTime.of(2013, 11, 27, 11, 45), "Ion", 1330.0, "S-Band", 41500000.0, 16.0, "Radar", "Magnetometer", 266, true, "Aborted", 66.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-167", "Mission-167", "Pluto", "ESA", 2170.0, LocalDateTime.of(2012, 12, 28, 10, 30), LocalDateTime.of(2014, 12, 28, 11, 45), "Nuclear", 1335.0, "Ka-Band", 41750000.0, 17.0, "Magnetometer", "Camera", 267, false, "In Progress", 67.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-168", "Mission-168", "Mars", "JAXA", 2180.0, LocalDateTime.of(2013, 1, 1, 10, 30), LocalDateTime.of(2015, 1, 1, 11, 45), "Chemical", 1340.0, "X-Band", 42000000.0, 18.0, "Camera", "Spectrometer", 268, true, "Success", 68.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-169", "Mission-169", "Moon", "SpaceX", 2190.0, LocalDateTime.of(2014, 2, 2, 10, 30), LocalDateTime.of(2016, 2, 2, 11, 45), "Solar Electric", 1345.0, "S-Band", 42250000.0, 19.0, "Spectrometer", "Radar", 269, false, "Failed", 69.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-170", "Mission-170", "Jupiter", "NASA", 2200.0, LocalDateTime.of(2015, 3, 3, 10, 30), LocalDateTime.of(2017, 3, 3, 11, 45), "Ion", 1350.0, "Ka-Band", 42500000.0, 20.0, "Radar", "Magnetometer", 270, true, "Aborted", 70.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-171", "Mission-171", "Saturn", "ISRO", 2210.0, LocalDateTime.of(2016, 4, 4, 10, 30), LocalDateTime.of(2018, 4, 4, 11, 45), "Nuclear", 1355.0, "X-Band", 42750000.0, 21.0, "Magnetometer", "Camera", 271, false, "In Progress", 71.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-172", "Mission-172", "Venus", "ESA", 2220.0, LocalDateTime.of(2017, 5, 5, 10, 30), LocalDateTime.of(2019, 5, 5, 11, 45), "Chemical", 1360.0, "S-Band", 43000000.0, 22.0, "Camera", "Spectrometer", 272, true, "Success", 72.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-173", "Mission-173", "Pluto", "JAXA", 2230.0, LocalDateTime.of(2018, 6, 6, 10, 30), LocalDateTime.of(2020, 6, 6, 11, 45), "Solar Electric", 1365.0, "Ka-Band", 43250000.0, 23.0, "Spectrometer", "Radar", 273, false, "Failed", 73.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-174", "Mission-174", "Mars", "SpaceX", 2240.0, LocalDateTime.of(2019, 7, 7, 10, 30), LocalDateTime.of(2021, 7, 7, 11, 45), "Ion", 1370.0, "X-Band", 43500000.0, 24.0, "Radar", "Magnetometer", 274, true, "Aborted", 74.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-175", "Mission-175", "Moon", "NASA", 2250.0, LocalDateTime.of(2020, 8, 8, 10, 30), LocalDateTime.of(2022, 8, 8, 11, 45), "Nuclear", 1375.0, "S-Band", 43750000.0, 25.0, "Magnetometer", "Camera", 275, false, "In Progress", 75.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-176", "Mission-176", "Jupiter", "ISRO", 2260.0, LocalDateTime.of(2021, 9, 9, 10, 30), LocalDateTime.of(2023, 9, 9, 11, 45), "Chemical", 1380.0, "Ka-Band", 44000000.0, 26.0, "Camera", "Spectrometer", 276, true, "Success", 76.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-177", "Mission-177", "Saturn", "ESA", 2270.0, LocalDateTime.of(2022, 10, 10, 10, 30), LocalDateTime.of(2024, 10, 10, 11, 45), "Solar Electric", 1385.0, "X-Band", 44250000.0, 27.0, "Spectrometer", "Radar", 277, false, "Failed", 77.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-178", "Mission-178", "Venus", "JAXA", 2280.0, LocalDateTime.of(2023, 11, 11, 10, 30), LocalDateTime.of(2025, 11, 11, 11, 45), "Ion", 1390.0, "S-Band", 44500000.0, 28.0, "Radar", "Magnetometer", 278, true, "Aborted", 78.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-179", "Mission-179", "Pluto", "SpaceX", 2290.0, LocalDateTime.of(2024, 12, 12, 10, 30), LocalDateTime.of(2026, 12, 12, 11, 45), "Nuclear", 1395.0, "Ka-Band", 44750000.0, 29.0, "Magnetometer", "Camera", 279, false, "In Progress", 79.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-180", "Mission-180", "Mars", "NASA", 2300.0, LocalDateTime.of(2010, 1, 13, 10, 30), LocalDateTime.of(2012, 1, 13, 11, 45), "Chemical", 1400.0, "X-Band", 45000000.0, 30.0, "Camera", "Spectrometer", 280, true, "Success", 80.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-181", "Mission-181", "Moon", "ISRO", 2310.0, LocalDateTime.of(2011, 2, 14, 10, 30), LocalDateTime.of(2013, 2, 14, 11, 45), "Solar Electric", 1405.0, "S-Band", 45250000.0, 31.0, "Spectrometer", "Radar", 281, false, "Failed", 81.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-182", "Mission-182", "Jupiter", "ESA", 2320.0, LocalDateTime.of(2012, 3, 15, 10, 30), LocalDateTime.of(2014, 3, 15, 11, 45), "Ion", 1410.0, "Ka-Band", 45500000.0, 32.0, "Radar", "Magnetometer", 282, true, "Aborted", 82.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-183", "Mission-183", "Saturn", "JAXA", 2330.0, LocalDateTime.of(2013, 4, 16, 10, 30), LocalDateTime.of(2015, 4, 16, 11, 45), "Nuclear", 1415.0, "X-Band", 45750000.0, 33.0, "Magnetometer", "Camera", 283, false, "In Progress", 83.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-184", "Mission-184", "Venus", "SpaceX", 2340.0, LocalDateTime.of(2014, 5, 17, 10, 30), LocalDateTime.of(2016, 5, 17, 11, 45), "Chemical", 1420.0, "S-Band", 46000000.0, 34.0, "Camera", "Spectrometer", 284, true, "Success", 84.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-185", "Mission-185", "Pluto", "NASA", 2350.0, LocalDateTime.of(2015, 6, 18, 10, 30), LocalDateTime.of(2017, 6, 18, 11, 45), "Solar Electric", 1425.0, "Ka-Band", 46250000.0, 35.0, "Spectrometer", "Radar", 285, false, "Failed", 85.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-186", "Mission-186", "Mars", "ISRO", 2360.0, LocalDateTime.of(2016, 7, 19, 10, 30), LocalDateTime.of(2018, 7, 19, 11, 45), "Ion", 1430.0, "X-Band", 46500000.0, 36.0, "Radar", "Magnetometer", 286, true, "Aborted", 86.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-187", "Mission-187", "Moon", "ESA", 2370.0, LocalDateTime.of(2017, 8, 20, 10, 30), LocalDateTime.of(2019, 8, 20, 11, 45), "Nuclear", 1435.0, "S-Band", 46750000.0, 37.0, "Magnetometer", "Camera", 287, false, "In Progress", 87.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-188", "Mission-188", "Jupiter", "JAXA", 2380.0, LocalDateTime.of(2018, 9, 21, 10, 30), LocalDateTime.of(2020, 9, 21, 11, 45), "Chemical", 1440.0, "Ka-Band", 47000000.0, 38.0, "Camera", "Spectrometer", 288, true, "Success", 88.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-189", "Mission-189", "Saturn", "SpaceX", 2390.0, LocalDateTime.of(2019, 10, 22, 10, 30), LocalDateTime.of(2021, 10, 22, 11, 45), "Solar Electric", 1445.0, "X-Band", 47250000.0, 39.0, "Spectrometer", "Radar", 289, false, "Failed", 89.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-190", "Mission-190", "Venus", "NASA", 2400.0, LocalDateTime.of(2020, 11, 23, 10, 30), LocalDateTime.of(2022, 11, 23, 11, 45), "Ion", 1450.0, "S-Band", 47500000.0, 40.0, "Radar", "Magnetometer", 290, true, "Aborted", 90.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-191", "Mission-191", "Pluto", "ISRO", 2410.0, LocalDateTime.of(2021, 12, 24, 10, 30), LocalDateTime.of(2023, 12, 24, 11, 45), "Nuclear", 1455.0, "Ka-Band", 47750000.0, 41.0, "Magnetometer", "Camera", 291, false, "In Progress", 91.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-192", "Mission-192", "Mars", "ESA", 2420.0, LocalDateTime.of(2022, 1, 25, 10, 30), LocalDateTime.of(2024, 1, 25, 11, 45), "Chemical", 1460.0, "X-Band", 48000000.0, 42.0, "Camera", "Spectrometer", 292, true, "Success", 92.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-193", "Mission-193", "Moon", "JAXA", 2430.0, LocalDateTime.of(2023, 2, 26, 10, 30), LocalDateTime.of(2025, 2, 26, 11, 45), "Solar Electric", 1465.0, "S-Band", 48250000.0, 43.0, "Spectrometer", "Radar", 293, false, "Failed", 93.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-194", "Mission-194", "Jupiter", "SpaceX", 2440.0, LocalDateTime.of(2024, 3, 27, 10, 30), LocalDateTime.of(2026, 3, 27, 11, 45), "Ion", 1470.0, "Ka-Band", 48500000.0, 44.0, "Radar", "Magnetometer", 294, true, "Aborted", 94.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-195", "Mission-195", "Saturn", "NASA", 2450.0, LocalDateTime.of(2010, 4, 28, 10, 30), LocalDateTime.of(2012, 4, 28, 11, 45), "Nuclear", 1475.0, "X-Band", 48750000.0, 45.0, "Magnetometer", "Camera", 295, false, "In Progress", 95.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-196", "Mission-196", "Venus", "ISRO", 2460.0, LocalDateTime.of(2011, 5, 1, 10, 30), LocalDateTime.of(2013, 5, 1, 11, 45), "Chemical", 1480.0, "S-Band", 49000000.0, 46.0, "Camera", "Spectrometer", 296, true, "Success", 96.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-197", "Mission-197", "Pluto", "ESA", 2470.0, LocalDateTime.of(2012, 6, 2, 10, 30), LocalDateTime.of(2014, 6, 2, 11, 45), "Solar Electric", 1485.0, "Ka-Band", 49250000.0, 47.0, "Spectrometer", "Radar", 297, false, "Failed", 97.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-198", "Mission-198", "Mars", "JAXA", 2480.0, LocalDateTime.of(2013, 7, 3, 10, 30), LocalDateTime.of(2015, 7, 3, 11, 45), "Ion", 1490.0, "X-Band", 49500000.0, 48.0, "Radar", "Magnetometer", 298, true, "Aborted", 98.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-199", "Mission-199", "Moon", "SpaceX", 2490.0, LocalDateTime.of(2014, 8, 4, 10, 30), LocalDateTime.of(2016, 8, 4, 11, 45), "Nuclear", 1495.0, "S-Band", 49750000.0, 49.0, "Magnetometer", "Camera", 299, false, "In Progress", 99.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-200", "Mission-200", "Jupiter", "NASA", 2500.0, LocalDateTime.of(2015, 9, 5, 10, 30), LocalDateTime.of(2017, 9, 5, 11, 45), "Chemical", 1500.0, "Ka-Band", 50000000.0, 10.0, "Camera", "Spectrometer", 300, true, "Success", 0.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-201", "Mission-201", "Saturn", "ISRO", 2510.0, LocalDateTime.of(2016, 10, 6, 10, 30), LocalDateTime.of(2018, 10, 6, 11, 45), "Solar Electric", 1505.0, "X-Band", 50250000.0, 11.0, "Spectrometer", "Radar", 301, false, "Failed", 1.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-202", "Mission-202", "Venus", "ESA", 2520.0, LocalDateTime.of(2017, 11, 7, 10, 30), LocalDateTime.of(2019, 11, 7, 11, 45), "Ion", 1510.0, "S-Band", 50500000.0, 12.0, "Radar", "Magnetometer", 302, true, "Aborted", 2.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-203", "Mission-203", "Pluto", "JAXA", 2530.0, LocalDateTime.of(2018, 12, 8, 10, 30), LocalDateTime.of(2020, 12, 8, 11, 45), "Nuclear", 1515.0, "Ka-Band", 50750000.0, 13.0, "Magnetometer", "Camera", 303, false, "In Progress", 3.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-204", "Mission-204", "Mars", "SpaceX", 2540.0, LocalDateTime.of(2019, 1, 9, 10, 30), LocalDateTime.of(2021, 1, 9, 11, 45), "Chemical", 1520.0, "X-Band", 51000000.0, 14.0, "Camera", "Spectrometer", 304, true, "Success", 4.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-205", "Mission-205", "Moon", "NASA", 2550.0, LocalDateTime.of(2020, 2, 10, 10, 30), LocalDateTime.of(2022, 2, 10, 11, 45), "Solar Electric", 1525.0, "S-Band", 51250000.0, 15.0, "Spectrometer", "Radar", 305, false, "Failed", 5.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-206", "Mission-206", "Jupiter", "ISRO", 2560.0, LocalDateTime.of(2021, 3, 11, 10, 30), LocalDateTime.of(2023, 3, 11, 11, 45), "Ion", 1530.0, "Ka-Band", 51500000.0, 16.0, "Radar", "Magnetometer", 306, true, "Aborted", 6.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-207", "Mission-207", "Saturn", "ESA", 2570.0, LocalDateTime.of(2022, 4, 12, 10, 30), LocalDateTime.of(2024, 4, 12, 11, 45), "Nuclear", 1535.0, "X-Band", 51750000.0, 17.0, "Magnetometer", "Camera", 307, false, "In Progress", 7.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-208", "Mission-208", "Venus", "JAXA", 2580.0, LocalDateTime.of(2023, 5, 13, 10, 30), LocalDateTime.of(2025, 5, 13, 11, 45), "Chemical", 1540.0, "S-Band", 52000000.0, 18.0, "Camera", "Spectrometer", 308, true, "Success", 8.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-209", "Mission-209", "Pluto", "SpaceX", 2590.0, LocalDateTime.of(2024, 6, 14, 10, 30), LocalDateTime.of(2026, 6, 14, 11, 45), "Solar Electric", 1545.0, "Ka-Band", 52250000.0, 19.0, "Spectrometer", "Radar", 309, false, "Failed", 9.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-210", "Mission-210", "Mars", "NASA", 2600.0, LocalDateTime.of(2010, 7, 15, 10, 30), LocalDateTime.of(2012, 7, 15, 11, 45), "Ion", 1550.0, "X-Band", 52500000.0, 20.0, "Radar", "Magnetometer", 310, true, "Aborted", 10.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-211", "Mission-211", "Moon", "ISRO", 2610.0, LocalDateTime.of(2011, 8, 16, 10, 30), LocalDateTime.of(2013, 8, 16, 11, 45), "Nuclear", 1555.0, "S-Band", 52750000.0, 21.0, "Magnetometer", "Camera", 311, false, "In Progress", 11.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-212", "Mission-212", "Jupiter", "ESA", 2620.0, LocalDateTime.of(2012, 9, 17, 10, 30), LocalDateTime.of(2014, 9, 17, 11, 45), "Chemical", 1560.0, "Ka-Band", 53000000.0, 22.0, "Camera", "Spectrometer", 312, true, "Success", 12.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-213", "Mission-213", "Saturn", "JAXA", 2630.0, LocalDateTime.of(2013, 10, 18, 10, 30), LocalDateTime.of(2015, 10, 18, 11, 45), "Solar Electric", 1565.0, "X-Band", 53250000.0, 23.0, "Spectrometer", "Radar", 313, false, "Failed", 13.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-214", "Mission-214", "Venus", "SpaceX", 2640.0, LocalDateTime.of(2014, 11, 19, 10, 30), LocalDateTime.of(2016, 11, 19, 11, 45), "Ion", 1570.0, "S-Band", 53500000.0, 24.0, "Radar", "Magnetometer", 314, true, "Aborted", 14.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-215", "Mission-215", "Pluto", "NASA", 2650.0, LocalDateTime.of(2015, 12, 20, 10, 30), LocalDateTime.of(2017, 12, 20, 11, 45), "Nuclear", 1575.0, "Ka-Band", 53750000.0, 25.0, "Magnetometer", "Camera", 315, false, "In Progress", 15.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-216", "Mission-216", "Mars", "ISRO", 2660.0, LocalDateTime.of(2016, 1, 21, 10, 30), LocalDateTime.of(2018, 1, 21, 11, 45), "Chemical", 1580.0, "X-Band", 54000000.0, 26.0, "Camera", "Spectrometer", 316, true, "Success", 16.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-217", "Mission-217", "Moon", "ESA", 2670.0, LocalDateTime.of(2017, 2, 22, 10, 30), LocalDateTime.of(2019, 2, 22, 11, 45), "Solar Electric", 1585.0, "S-Band", 54250000.0, 27.0, "Spectrometer", "Radar", 317, false, "Failed", 17.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-218", "Mission-218", "Jupiter", "JAXA", 2680.0, LocalDateTime.of(2018, 3, 23, 10, 30), LocalDateTime.of(2020, 3, 23, 11, 45), "Ion", 1590.0, "Ka-Band", 54500000.0, 28.0, "Radar", "Magnetometer", 318, true, "Aborted", 18.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-219", "Mission-219", "Saturn", "SpaceX", 2690.0, LocalDateTime.of(2019, 4, 24, 10, 30), LocalDateTime.of(2021, 4, 24, 11, 45), "Nuclear", 1595.0, "X-Band", 54750000.0, 29.0, "Magnetometer", "Camera", 319, false, "In Progress", 19.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-220", "Mission-220", "Venus", "NASA", 2700.0, LocalDateTime.of(2020, 5, 25, 10, 30), LocalDateTime.of(2022, 5, 25, 11, 45), "Chemical", 1600.0, "S-Band", 55000000.0, 30.0, "Camera", "Spectrometer", 320, true, "Success", 20.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-221", "Mission-221", "Pluto", "ISRO", 2710.0, LocalDateTime.of(2021, 6, 26, 10, 30), LocalDateTime.of(2023, 6, 26, 11, 45), "Solar Electric", 1605.0, "Ka-Band", 55250000.0, 31.0, "Spectrometer", "Radar", 321, false, "Failed", 21.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-222", "Mission-222", "Mars", "ESA", 2720.0, LocalDateTime.of(2022, 7, 27, 10, 30), LocalDateTime.of(2024, 7, 27, 11, 45), "Ion", 1610.0, "X-Band", 55500000.0, 32.0, "Radar", "Magnetometer", 322, true, "Aborted", 22.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-223", "Mission-223", "Moon", "JAXA", 2730.0, LocalDateTime.of(2023, 8, 28, 10, 30), LocalDateTime.of(2025, 8, 28, 11, 45), "Nuclear", 1615.0, "S-Band", 55750000.0, 33.0, "Magnetometer", "Camera", 323, false, "In Progress", 23.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-224", "Mission-224", "Jupiter", "SpaceX", 2740.0, LocalDateTime.of(2024, 9, 1, 10, 30), LocalDateTime.of(2026, 9, 1, 11, 45), "Chemical", 1620.0, "Ka-Band", 56000000.0, 34.0, "Camera", "Spectrometer", 324, true, "Success", 24.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-225", "Mission-225", "Saturn", "NASA", 2750.0, LocalDateTime.of(2010, 10, 2, 10, 30), LocalDateTime.of(2012, 10, 2, 11, 45), "Solar Electric", 1625.0, "X-Band", 56250000.0, 35.0, "Spectrometer", "Radar", 325, false, "Failed", 25.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-226", "Mission-226", "Venus", "ISRO", 2760.0, LocalDateTime.of(2011, 11, 3, 10, 30), LocalDateTime.of(2013, 11, 3, 11, 45), "Ion", 1630.0, "S-Band", 56500000.0, 36.0, "Radar", "Magnetometer", 326, true, "Aborted", 26.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-227", "Mission-227", "Pluto", "ESA", 2770.0, LocalDateTime.of(2012, 12, 4, 10, 30), LocalDateTime.of(2014, 12, 4, 11, 45), "Nuclear", 1635.0, "Ka-Band", 56750000.0, 37.0, "Magnetometer", "Camera", 327, false, "In Progress", 27.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-228", "Mission-228", "Mars", "JAXA", 2780.0, LocalDateTime.of(2013, 1, 5, 10, 30), LocalDateTime.of(2015, 1, 5, 11, 45), "Chemical", 1640.0, "X-Band", 57000000.0, 38.0, "Camera", "Spectrometer", 328, true, "Success", 28.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-229", "Mission-229", "Moon", "SpaceX", 2790.0, LocalDateTime.of(2014, 2, 6, 10, 30), LocalDateTime.of(2016, 2, 6, 11, 45), "Solar Electric", 1645.0, "S-Band", 57250000.0, 39.0, "Spectrometer", "Radar", 329, false, "Failed", 29.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-230", "Mission-230", "Jupiter", "NASA", 2800.0, LocalDateTime.of(2015, 3, 7, 10, 30), LocalDateTime.of(2017, 3, 7, 11, 45), "Ion", 1650.0, "Ka-Band", 57500000.0, 40.0, "Radar", "Magnetometer", 330, true, "Aborted", 30.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-231", "Mission-231", "Saturn", "ISRO", 2810.0, LocalDateTime.of(2016, 4, 8, 10, 30), LocalDateTime.of(2018, 4, 8, 11, 45), "Nuclear", 1655.0, "X-Band", 57750000.0, 41.0, "Magnetometer", "Camera", 331, false, "In Progress", 31.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-232", "Mission-232", "Venus", "ESA", 2820.0, LocalDateTime.of(2017, 5, 9, 10, 30), LocalDateTime.of(2019, 5, 9, 11, 45), "Chemical", 1660.0, "S-Band", 58000000.0, 42.0, "Camera", "Spectrometer", 332, true, "Success", 32.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-233", "Mission-233", "Pluto", "JAXA", 2830.0, LocalDateTime.of(2018, 6, 10, 10, 30), LocalDateTime.of(2020, 6, 10, 11, 45), "Solar Electric", 1665.0, "Ka-Band", 58250000.0, 43.0, "Spectrometer", "Radar", 333, false, "Failed", 33.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-234", "Mission-234", "Mars", "SpaceX", 2840.0, LocalDateTime.of(2019, 7, 11, 10, 30), LocalDateTime.of(2021, 7, 11, 11, 45), "Ion", 1670.0, "X-Band", 58500000.0, 44.0, "Radar", "Magnetometer", 334, true, "Aborted", 34.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-235", "Mission-235", "Moon", "NASA", 2850.0, LocalDateTime.of(2020, 8, 12, 10, 30), LocalDateTime.of(2022, 8, 12, 11, 45), "Nuclear", 1675.0, "S-Band", 58750000.0, 45.0, "Magnetometer", "Camera", 335, false, "In Progress", 35.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-236", "Mission-236", "Jupiter", "ISRO", 2860.0, LocalDateTime.of(2021, 9, 13, 10, 30), LocalDateTime.of(2023, 9, 13, 11, 45), "Chemical", 1680.0, "Ka-Band", 59000000.0, 46.0, "Camera", "Spectrometer", 336, true, "Success", 36.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-237", "Mission-237", "Saturn", "ESA", 2870.0, LocalDateTime.of(2022, 10, 14, 10, 30), LocalDateTime.of(2024, 10, 14, 11, 45), "Solar Electric", 1685.0, "X-Band", 59250000.0, 47.0, "Spectrometer", "Radar", 337, false, "Failed", 37.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-238", "Mission-238", "Venus", "JAXA", 2880.0, LocalDateTime.of(2023, 11, 15, 10, 30), LocalDateTime.of(2025, 11, 15, 11, 45), "Ion", 1690.0, "S-Band", 59500000.0, 48.0, "Radar", "Magnetometer", 338, true, "Aborted", 38.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-239", "Mission-239", "Pluto", "SpaceX", 2890.0, LocalDateTime.of(2024, 12, 16, 10, 30), LocalDateTime.of(2026, 12, 16, 11, 45), "Nuclear", 1695.0, "Ka-Band", 59750000.0, 49.0, "Magnetometer", "Camera", 339, false, "In Progress", 39.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-240", "Mission-240", "Mars", "NASA", 2900.0, LocalDateTime.of(2010, 1, 17, 10, 30), LocalDateTime.of(2012, 1, 17, 11, 45), "Chemical", 1700.0, "X-Band", 60000000.0, 10.0, "Camera", "Spectrometer", 340, true, "Success", 40.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-241", "Mission-241", "Moon", "ISRO", 2910.0, LocalDateTime.of(2011, 2, 18, 10, 30), LocalDateTime.of(2013, 2, 18, 11, 45), "Solar Electric", 1705.0, "S-Band", 60250000.0, 11.0, "Spectrometer", "Radar", 341, false, "Failed", 41.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-242", "Mission-242", "Jupiter", "ESA", 2920.0, LocalDateTime.of(2012, 3, 19, 10, 30), LocalDateTime.of(2014, 3, 19, 11, 45), "Ion", 1710.0, "Ka-Band", 60500000.0, 12.0, "Radar", "Magnetometer", 342, true, "Aborted", 42.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-243", "Mission-243", "Saturn", "JAXA", 2930.0, LocalDateTime.of(2013, 4, 20, 10, 30), LocalDateTime.of(2015, 4, 20, 11, 45), "Nuclear", 1715.0, "X-Band", 60750000.0, 13.0, "Magnetometer", "Camera", 343, false, "In Progress", 43.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-244", "Mission-244", "Venus", "SpaceX", 2940.0, LocalDateTime.of(2014, 5, 21, 10, 30), LocalDateTime.of(2016, 5, 21, 11, 45), "Chemical", 1720.0, "S-Band", 61000000.0, 14.0, "Camera", "Spectrometer", 344, true, "Success", 44.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-245", "Mission-245", "Pluto", "NASA", 2950.0, LocalDateTime.of(2015, 6, 22, 10, 30), LocalDateTime.of(2017, 6, 22, 11, 45), "Solar Electric", 1725.0, "Ka-Band", 61250000.0, 15.0, "Spectrometer", "Radar", 345, false, "Failed", 45.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-246", "Mission-246", "Mars", "ISRO", 2960.0, LocalDateTime.of(2016, 7, 23, 10, 30), LocalDateTime.of(2018, 7, 23, 11, 45), "Ion", 1730.0, "X-Band", 61500000.0, 16.0, "Radar", "Magnetometer", 346, true, "Aborted", 46.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-247", "Mission-247", "Moon", "ESA", 2970.0, LocalDateTime.of(2017, 8, 24, 10, 30), LocalDateTime.of(2019, 8, 24, 11, 45), "Nuclear", 1735.0, "S-Band", 61750000.0, 17.0, "Magnetometer", "Camera", 347, false, "In Progress", 47.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-248", "Mission-248", "Jupiter", "JAXA", 2980.0, LocalDateTime.of(2018, 9, 25, 10, 30), LocalDateTime.of(2020, 9, 25, 11, 45), "Chemical", 1740.0, "Ka-Band", 62000000.0, 18.0, "Camera", "Spectrometer", 348, true, "Success", 48.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-249", "Mission-249", "Saturn", "SpaceX", 2990.0, LocalDateTime.of(2019, 10, 26, 10, 30), LocalDateTime.of(2021, 10, 26, 11, 45), "Solar Electric", 1745.0, "X-Band", 62250000.0, 19.0, "Spectrometer", "Radar", 349, false, "Failed", 49.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-250", "Mission-250", "Venus", "NASA", 3000.0, LocalDateTime.of(2020, 11, 27, 10, 30), LocalDateTime.of(2022, 11, 27, 11, 45), "Ion", 1750.0, "S-Band", 62500000.0, 20.0, "Radar", "Magnetometer", 350, true, "Aborted", 50.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-251", "Mission-251", "Pluto", "ISRO", 3010.0, LocalDateTime.of(2021, 12, 28, 10, 30), LocalDateTime.of(2023, 12, 28, 11, 45), "Nuclear", 1755.0, "Ka-Band", 62750000.0, 21.0, "Magnetometer", "Camera", 351, false, "In Progress", 51.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-252", "Mission-252", "Mars", "ESA", 3020.0, LocalDateTime.of(2022, 1, 1, 10, 30), LocalDateTime.of(2024, 1, 1, 11, 45), "Chemical", 1760.0, "X-Band", 63000000.0, 22.0, "Camera", "Spectrometer", 352, true, "Success", 52.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-253", "Mission-253", "Moon", "JAXA", 3030.0, LocalDateTime.of(2023, 2, 2, 10, 30), LocalDateTime.of(2025, 2, 2, 11, 45), "Solar Electric", 1765.0, "S-Band", 63250000.0, 23.0, "Spectrometer", "Radar", 353, false, "Failed", 53.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-254", "Mission-254", "Jupiter", "SpaceX", 3040.0, LocalDateTime.of(2024, 3, 3, 10, 30), LocalDateTime.of(2026, 3, 3, 11, 45), "Ion", 1770.0, "Ka-Band", 63500000.0, 24.0, "Radar", "Magnetometer", 354, true, "Aborted", 54.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-255", "Mission-255", "Saturn", "NASA", 3050.0, LocalDateTime.of(2010, 4, 4, 10, 30), LocalDateTime.of(2012, 4, 4, 11, 45), "Nuclear", 1775.0, "X-Band", 63750000.0, 25.0, "Magnetometer", "Camera", 355, false, "In Progress", 55.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-256", "Mission-256", "Venus", "ISRO", 3060.0, LocalDateTime.of(2011, 5, 5, 10, 30), LocalDateTime.of(2013, 5, 5, 11, 45), "Chemical", 1780.0, "S-Band", 64000000.0, 26.0, "Camera", "Spectrometer", 356, true, "Success", 56.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-257", "Mission-257", "Pluto", "ESA", 3070.0, LocalDateTime.of(2012, 6, 6, 10, 30), LocalDateTime.of(2014, 6, 6, 11, 45), "Solar Electric", 1785.0, "Ka-Band", 64250000.0, 27.0, "Spectrometer", "Radar", 357, false, "Failed", 57.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-258", "Mission-258", "Mars", "JAXA", 3080.0, LocalDateTime.of(2013, 7, 7, 10, 30), LocalDateTime.of(2015, 7, 7, 11, 45), "Ion", 1790.0, "X-Band", 64500000.0, 28.0, "Radar", "Magnetometer", 358, true, "Aborted", 58.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-259", "Mission-259", "Moon", "SpaceX", 3090.0, LocalDateTime.of(2014, 8, 8, 10, 30), LocalDateTime.of(2016, 8, 8, 11, 45), "Nuclear", 1795.0, "S-Band", 64750000.0, 29.0, "Magnetometer", "Camera", 359, false, "In Progress", 59.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-260", "Mission-260", "Jupiter", "NASA", 3100.0, LocalDateTime.of(2015, 9, 9, 10, 30), LocalDateTime.of(2017, 9, 9, 11, 45), "Chemical", 1800.0, "Ka-Band", 65000000.0, 30.0, "Camera", "Spectrometer", 360, true, "Success", 60.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-261", "Mission-261", "Saturn", "ISRO", 3110.0, LocalDateTime.of(2016, 10, 10, 10, 30), LocalDateTime.of(2018, 10, 10, 11, 45), "Solar Electric", 1805.0, "X-Band", 65250000.0, 31.0, "Spectrometer", "Radar", 361, false, "Failed", 61.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-262", "Mission-262", "Venus", "ESA", 3120.0, LocalDateTime.of(2017, 11, 11, 10, 30), LocalDateTime.of(2019, 11, 11, 11, 45), "Ion", 1810.0, "S-Band", 65500000.0, 32.0, "Radar", "Magnetometer", 362, true, "Aborted", 62.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-263", "Mission-263", "Pluto", "JAXA", 3130.0, LocalDateTime.of(2018, 12, 12, 10, 30), LocalDateTime.of(2020, 12, 12, 11, 45), "Nuclear", 1815.0, "Ka-Band", 65750000.0, 33.0, "Magnetometer", "Camera", 363, false, "In Progress", 63.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-264", "Mission-264", "Mars", "SpaceX", 3140.0, LocalDateTime.of(2019, 1, 13, 10, 30), LocalDateTime.of(2021, 1, 13, 11, 45), "Chemical", 1820.0, "X-Band", 66000000.0, 34.0, "Camera", "Spectrometer", 364, true, "Success", 64.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-265", "Mission-265", "Moon", "NASA", 3150.0, LocalDateTime.of(2020, 2, 14, 10, 30), LocalDateTime.of(2022, 2, 14, 11, 45), "Solar Electric", 1825.0, "S-Band", 66250000.0, 35.0, "Spectrometer", "Radar", 365, false, "Failed", 65.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-266", "Mission-266", "Jupiter", "ISRO", 3160.0, LocalDateTime.of(2021, 3, 15, 10, 30), LocalDateTime.of(2023, 3, 15, 11, 45), "Ion", 1830.0, "Ka-Band", 66500000.0, 36.0, "Radar", "Magnetometer", 366, true, "Aborted", 66.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-267", "Mission-267", "Saturn", "ESA", 3170.0, LocalDateTime.of(2022, 4, 16, 10, 30), LocalDateTime.of(2024, 4, 16, 11, 45), "Nuclear", 1835.0, "X-Band", 66750000.0, 37.0, "Magnetometer", "Camera", 367, false, "In Progress", 67.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-268", "Mission-268", "Venus", "JAXA", 3180.0, LocalDateTime.of(2023, 5, 17, 10, 30), LocalDateTime.of(2025, 5, 17, 11, 45), "Chemical", 1840.0, "S-Band", 67000000.0, 38.0, "Camera", "Spectrometer", 368, true, "Success", 68.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-269", "Mission-269", "Pluto", "SpaceX", 3190.0, LocalDateTime.of(2024, 6, 18, 10, 30), LocalDateTime.of(2026, 6, 18, 11, 45), "Solar Electric", 1845.0, "Ka-Band", 67250000.0, 39.0, "Spectrometer", "Radar", 369, false, "Failed", 69.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-270", "Mission-270", "Mars", "NASA", 3200.0, LocalDateTime.of(2010, 7, 19, 10, 30), LocalDateTime.of(2012, 7, 19, 11, 45), "Ion", 1850.0, "X-Band", 67500000.0, 40.0, "Radar", "Magnetometer", 370, true, "Aborted", 70.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-271", "Mission-271", "Moon", "ISRO", 3210.0, LocalDateTime.of(2011, 8, 20, 10, 30), LocalDateTime.of(2013, 8, 20, 11, 45), "Nuclear", 1855.0, "S-Band", 67750000.0, 41.0, "Magnetometer", "Camera", 371, false, "In Progress", 71.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-272", "Mission-272", "Jupiter", "ESA", 3220.0, LocalDateTime.of(2012, 9, 21, 10, 30), LocalDateTime.of(2014, 9, 21, 11, 45), "Chemical", 1860.0, "Ka-Band", 68000000.0, 42.0, "Camera", "Spectrometer", 372, true, "Success", 72.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-273", "Mission-273", "Saturn", "JAXA", 3230.0, LocalDateTime.of(2013, 10, 22, 10, 30), LocalDateTime.of(2015, 10, 22, 11, 45), "Solar Electric", 1865.0, "X-Band", 68250000.0, 43.0, "Spectrometer", "Radar", 373, false, "Failed", 73.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-274", "Mission-274", "Venus", "SpaceX", 3240.0, LocalDateTime.of(2014, 11, 23, 10, 30), LocalDateTime.of(2016, 11, 23, 11, 45), "Ion", 1870.0, "S-Band", 68500000.0, 44.0, "Radar", "Magnetometer", 374, true, "Aborted", 74.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-275", "Mission-275", "Pluto", "NASA", 3250.0, LocalDateTime.of(2015, 12, 24, 10, 30), LocalDateTime.of(2017, 12, 24, 11, 45), "Nuclear", 1875.0, "Ka-Band", 68750000.0, 45.0, "Magnetometer", "Camera", 375, false, "In Progress", 75.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-276", "Mission-276", "Mars", "ISRO", 3260.0, LocalDateTime.of(2016, 1, 25, 10, 30), LocalDateTime.of(2018, 1, 25, 11, 45), "Chemical", 1880.0, "X-Band", 69000000.0, 46.0, "Camera", "Spectrometer", 376, true, "Success", 76.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-277", "Mission-277", "Moon", "ESA", 3270.0, LocalDateTime.of(2017, 2, 26, 10, 30), LocalDateTime.of(2019, 2, 26, 11, 45), "Solar Electric", 1885.0, "S-Band", 69250000.0, 47.0, "Spectrometer", "Radar", 377, false, "Failed", 77.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-278", "Mission-278", "Jupiter", "JAXA", 3280.0, LocalDateTime.of(2018, 3, 27, 10, 30), LocalDateTime.of(2020, 3, 27, 11, 45), "Ion", 1890.0, "Ka-Band", 69500000.0, 48.0, "Radar", "Magnetometer", 378, true, "Aborted", 78.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-279", "Mission-279", "Saturn", "SpaceX", 3290.0, LocalDateTime.of(2019, 4, 28, 10, 30), LocalDateTime.of(2021, 4, 28, 11, 45), "Nuclear", 1895.0, "X-Band", 69750000.0, 49.0, "Magnetometer", "Camera", 379, false, "In Progress", 79.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-280", "Mission-280", "Venus", "NASA", 3300.0, LocalDateTime.of(2020, 5, 1, 10, 30), LocalDateTime.of(2022, 5, 1, 11, 45), "Chemical", 1900.0, "S-Band", 70000000.0, 10.0, "Camera", "Spectrometer", 380, true, "Success", 80.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-281", "Mission-281", "Pluto", "ISRO", 3310.0, LocalDateTime.of(2021, 6, 2, 10, 30), LocalDateTime.of(2023, 6, 2, 11, 45), "Solar Electric", 1905.0, "Ka-Band", 70250000.0, 11.0, "Spectrometer", "Radar", 381, false, "Failed", 81.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-282", "Mission-282", "Mars", "ESA", 3320.0, LocalDateTime.of(2022, 7, 3, 10, 30), LocalDateTime.of(2024, 7, 3, 11, 45), "Ion", 1910.0, "X-Band", 70500000.0, 12.0, "Radar", "Magnetometer", 382, true, "Aborted", 82.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-283", "Mission-283", "Moon", "JAXA", 3330.0, LocalDateTime.of(2023, 8, 4, 10, 30), LocalDateTime.of(2025, 8, 4, 11, 45), "Nuclear", 1915.0, "S-Band", 70750000.0, 13.0, "Magnetometer", "Camera", 383, false, "In Progress", 83.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-284", "Mission-284", "Jupiter", "SpaceX", 3340.0, LocalDateTime.of(2024, 9, 5, 10, 30), LocalDateTime.of(2026, 9, 5, 11, 45), "Chemical", 1920.0, "Ka-Band", 71000000.0, 14.0, "Camera", "Spectrometer", 384, true, "Success", 84.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-285", "Mission-285", "Saturn", "NASA", 3350.0, LocalDateTime.of(2010, 10, 6, 10, 30), LocalDateTime.of(2012, 10, 6, 11, 45), "Solar Electric", 1925.0, "X-Band", 71250000.0, 15.0, "Spectrometer", "Radar", 385, false, "Failed", 85.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-286", "Mission-286", "Venus", "ISRO", 3360.0, LocalDateTime.of(2011, 11, 7, 10, 30), LocalDateTime.of(2013, 11, 7, 11, 45), "Ion", 1930.0, "S-Band", 71500000.0, 16.0, "Radar", "Magnetometer", 386, true, "Aborted", 86.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-287", "Mission-287", "Pluto", "ESA", 3370.0, LocalDateTime.of(2012, 12, 8, 10, 30), LocalDateTime.of(2014, 12, 8, 11, 45), "Nuclear", 1935.0, "Ka-Band", 71750000.0, 17.0, "Magnetometer", "Camera", 387, false, "In Progress", 87.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-288", "Mission-288", "Mars", "JAXA", 3380.0, LocalDateTime.of(2013, 1, 9, 10, 30), LocalDateTime.of(2015, 1, 9, 11, 45), "Chemical", 1940.0, "X-Band", 72000000.0, 18.0, "Camera", "Spectrometer", 388, true, "Success", 88.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-289", "Mission-289", "Moon", "SpaceX", 3390.0, LocalDateTime.of(2014, 2, 10, 10, 30), LocalDateTime.of(2016, 2, 10, 11, 45), "Solar Electric", 1945.0, "S-Band", 72250000.0, 19.0, "Spectrometer", "Radar", 389, false, "Failed", 89.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-290", "Mission-290", "Jupiter", "NASA", 3400.0, LocalDateTime.of(2015, 3, 11, 10, 30), LocalDateTime.of(2017, 3, 11, 11, 45), "Ion", 1950.0, "Ka-Band", 72500000.0, 20.0, "Radar", "Magnetometer", 390, true, "Aborted", 90.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-291", "Mission-291", "Saturn", "ISRO", 3410.0, LocalDateTime.of(2016, 4, 12, 10, 30), LocalDateTime.of(2018, 4, 12, 11, 45), "Nuclear", 1955.0, "X-Band", 72750000.0, 21.0, "Magnetometer", "Camera", 391, false, "In Progress", 91.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-292", "Mission-292", "Venus", "ESA", 3420.0, LocalDateTime.of(2017, 5, 13, 10, 30), LocalDateTime.of(2019, 5, 13, 11, 45), "Chemical", 1960.0, "S-Band", 73000000.0, 22.0, "Camera", "Spectrometer", 392, true, "Success", 92.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-293", "Mission-293", "Pluto", "JAXA", 3430.0, LocalDateTime.of(2018, 6, 14, 10, 30), LocalDateTime.of(2020, 6, 14, 11, 45), "Solar Electric", 1965.0, "Ka-Band", 73250000.0, 23.0, "Spectrometer", "Radar", 393, false, "Failed", 93.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-294", "Mission-294", "Mars", "SpaceX", 3440.0, LocalDateTime.of(2019, 7, 15, 10, 30), LocalDateTime.of(2021, 7, 15, 11, 45), "Ion", 1970.0, "X-Band", 73500000.0, 24.0, "Radar", "Magnetometer", 394, true, "Aborted", 94.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-295", "Mission-295", "Moon", "NASA", 3450.0, LocalDateTime.of(2020, 8, 16, 10, 30), LocalDateTime.of(2022, 8, 16, 11, 45), "Nuclear", 1975.0, "S-Band", 73750000.0, 25.0, "Magnetometer", "Camera", 395, false, "In Progress", 95.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-296", "Mission-296", "Jupiter", "ISRO", 3460.0, LocalDateTime.of(2021, 9, 17, 10, 30), LocalDateTime.of(2023, 9, 17, 11, 45), "Chemical", 1980.0, "Ka-Band", 74000000.0, 26.0, "Camera", "Spectrometer", 396, true, "Success", 96.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-297", "Mission-297", "Saturn", "ESA", 3470.0, LocalDateTime.of(2022, 10, 18, 10, 30), LocalDateTime.of(2024, 10, 18, 11, 45), "Solar Electric", 1985.0, "X-Band", 74250000.0, 27.0, "Spectrometer", "Radar", 397, false, "Failed", 97.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-298", "Mission-298", "Venus", "JAXA", 3480.0, LocalDateTime.of(2023, 11, 19, 10, 30), LocalDateTime.of(2025, 11, 19, 11, 45), "Ion", 1990.0, "S-Band", 74500000.0, 28.0, "Radar", "Magnetometer", 398, true, "Aborted", 98.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-299", "Mission-299", "Pluto", "SpaceX", 3490.0, LocalDateTime.of(2024, 12, 20, 10, 30), LocalDateTime.of(2026, 12, 20, 11, 45), "Nuclear", 1995.0, "Ka-Band", 74750000.0, 29.0, "Magnetometer", "Camera", 399, false, "In Progress", 99.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-300", "Mission-300", "Mars", "NASA", 3500.0, LocalDateTime.of(2010, 1, 21, 10, 30), LocalDateTime.of(2012, 1, 21, 11, 45), "Chemical", 2000.0, "X-Band", 75000000.0, 30.0, "Camera", "Spectrometer", 400, true, "Success", 0.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-301", "Mission-301", "Moon", "ISRO", 3510.0, LocalDateTime.of(2011, 2, 22, 10, 30), LocalDateTime.of(2013, 2, 22, 11, 45), "Solar Electric", 2005.0, "S-Band", 75250000.0, 31.0, "Spectrometer", "Radar", 401, false, "Failed", 1.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-302", "Mission-302", "Jupiter", "ESA", 3520.0, LocalDateTime.of(2012, 3, 23, 10, 30), LocalDateTime.of(2014, 3, 23, 11, 45), "Ion", 2010.0, "Ka-Band", 75500000.0, 32.0, "Radar", "Magnetometer", 402, true, "Aborted", 2.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-303", "Mission-303", "Saturn", "JAXA", 3530.0, LocalDateTime.of(2013, 4, 24, 10, 30), LocalDateTime.of(2015, 4, 24, 11, 45), "Nuclear", 2015.0, "X-Band", 75750000.0, 33.0, "Magnetometer", "Camera", 403, false, "In Progress", 3.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-304", "Mission-304", "Venus", "SpaceX", 3540.0, LocalDateTime.of(2014, 5, 25, 10, 30), LocalDateTime.of(2016, 5, 25, 11, 45), "Chemical", 2020.0, "S-Band", 76000000.0, 34.0, "Camera", "Spectrometer", 404, true, "Success", 4.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-305", "Mission-305", "Pluto", "NASA", 3550.0, LocalDateTime.of(2015, 6, 26, 10, 30), LocalDateTime.of(2017, 6, 26, 11, 45), "Solar Electric", 2025.0, "Ka-Band", 76250000.0, 35.0, "Spectrometer", "Radar", 405, false, "Failed", 5.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-306", "Mission-306", "Mars", "ISRO", 3560.0, LocalDateTime.of(2016, 7, 27, 10, 30), LocalDateTime.of(2018, 7, 27, 11, 45), "Ion", 2030.0, "X-Band", 76500000.0, 36.0, "Radar", "Magnetometer", 406, true, "Aborted", 6.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-307", "Mission-307", "Moon", "ESA", 3570.0, LocalDateTime.of(2017, 8, 28, 10, 30), LocalDateTime.of(2019, 8, 28, 11, 45), "Nuclear", 2035.0, "S-Band", 76750000.0, 37.0, "Magnetometer", "Camera", 407, false, "In Progress", 7.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-308", "Mission-308", "Jupiter", "JAXA", 3580.0, LocalDateTime.of(2018, 9, 1, 10, 30), LocalDateTime.of(2020, 9, 1, 11, 45), "Chemical", 2040.0, "Ka-Band", 77000000.0, 38.0, "Camera", "Spectrometer", 408, true, "Success", 8.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-309", "Mission-309", "Saturn", "SpaceX", 3590.0, LocalDateTime.of(2019, 10, 2, 10, 30), LocalDateTime.of(2021, 10, 2, 11, 45), "Solar Electric", 2045.0, "X-Band", 77250000.0, 39.0, "Spectrometer", "Radar", 409, false, "Failed", 9.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-310", "Mission-310", "Venus", "NASA", 3600.0, LocalDateTime.of(2020, 11, 3, 10, 30), LocalDateTime.of(2022, 11, 3, 11, 45), "Ion", 2050.0, "S-Band", 77500000.0, 40.0, "Radar", "Magnetometer", 410, true, "Aborted", 10.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-311", "Mission-311", "Pluto", "ISRO", 3610.0, LocalDateTime.of(2021, 12, 4, 10, 30), LocalDateTime.of(2023, 12, 4, 11, 45), "Nuclear", 2055.0, "Ka-Band", 77750000.0, 41.0, "Magnetometer", "Camera", 411, false, "In Progress", 11.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-312", "Mission-312", "Mars", "ESA", 3620.0, LocalDateTime.of(2022, 1, 5, 10, 30), LocalDateTime.of(2024, 1, 5, 11, 45), "Chemical", 2060.0, "X-Band", 78000000.0, 42.0, "Camera", "Spectrometer", 412, true, "Success", 12.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-313", "Mission-313", "Moon", "JAXA", 3630.0, LocalDateTime.of(2023, 2, 6, 10, 30), LocalDateTime.of(2025, 2, 6, 11, 45), "Solar Electric", 2065.0, "S-Band", 78250000.0, 43.0, "Spectrometer", "Radar", 413, false, "Failed", 13.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-314", "Mission-314", "Jupiter", "SpaceX", 3640.0, LocalDateTime.of(2024, 3, 7, 10, 30), LocalDateTime.of(2026, 3, 7, 11, 45), "Ion", 2070.0, "Ka-Band", 78500000.0, 44.0, "Radar", "Magnetometer", 414, true, "Aborted", 14.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-315", "Mission-315", "Saturn", "NASA", 3650.0, LocalDateTime.of(2010, 4, 8, 10, 30), LocalDateTime.of(2012, 4, 8, 11, 45), "Nuclear", 2075.0, "X-Band", 78750000.0, 45.0, "Magnetometer", "Camera", 415, false, "In Progress", 15.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-316", "Mission-316", "Venus", "ISRO", 3660.0, LocalDateTime.of(2011, 5, 9, 10, 30), LocalDateTime.of(2013, 5, 9, 11, 45), "Chemical", 2080.0, "S-Band", 79000000.0, 46.0, "Camera", "Spectrometer", 416, true, "Success", 16.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-317", "Mission-317", "Pluto", "ESA", 3670.0, LocalDateTime.of(2012, 6, 10, 10, 30), LocalDateTime.of(2014, 6, 10, 11, 45), "Solar Electric", 2085.0, "Ka-Band", 79250000.0, 47.0, "Spectrometer", "Radar", 417, false, "Failed", 17.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-318", "Mission-318", "Mars", "JAXA", 3680.0, LocalDateTime.of(2013, 7, 11, 10, 30), LocalDateTime.of(2015, 7, 11, 11, 45), "Ion", 2090.0, "X-Band", 79500000.0, 48.0, "Radar", "Magnetometer", 418, true, "Aborted", 18.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-319", "Mission-319", "Moon", "SpaceX", 3690.0, LocalDateTime.of(2014, 8, 12, 10, 30), LocalDateTime.of(2016, 8, 12, 11, 45), "Nuclear", 2095.0, "S-Band", 79750000.0, 49.0, "Magnetometer", "Camera", 419, false, "In Progress", 19.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-320", "Mission-320", "Jupiter", "NASA", 3700.0, LocalDateTime.of(2015, 9, 13, 10, 30), LocalDateTime.of(2017, 9, 13, 11, 45), "Chemical", 2100.0, "Ka-Band", 80000000.0, 10.0, "Camera", "Spectrometer", 420, true, "Success", 20.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-321", "Mission-321", "Saturn", "ISRO", 3710.0, LocalDateTime.of(2016, 10, 14, 10, 30), LocalDateTime.of(2018, 10, 14, 11, 45), "Solar Electric", 2105.0, "X-Band", 80250000.0, 11.0, "Spectrometer", "Radar", 421, false, "Failed", 21.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-322", "Mission-322", "Venus", "ESA", 3720.0, LocalDateTime.of(2017, 11, 15, 10, 30), LocalDateTime.of(2019, 11, 15, 11, 45), "Ion", 2110.0, "S-Band", 80500000.0, 12.0, "Radar", "Magnetometer", 422, true, "Aborted", 22.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-323", "Mission-323", "Pluto", "JAXA", 3730.0, LocalDateTime.of(2018, 12, 16, 10, 30), LocalDateTime.of(2020, 12, 16, 11, 45), "Nuclear", 2115.0, "Ka-Band", 80750000.0, 13.0, "Magnetometer", "Camera", 423, false, "In Progress", 23.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-324", "Mission-324", "Mars", "SpaceX", 3740.0, LocalDateTime.of(2019, 1, 17, 10, 30), LocalDateTime.of(2021, 1, 17, 11, 45), "Chemical", 2120.0, "X-Band", 81000000.0, 14.0, "Camera", "Spectrometer", 424, true, "Success", 24.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-325", "Mission-325", "Moon", "NASA", 3750.0, LocalDateTime.of(2020, 2, 18, 10, 30), LocalDateTime.of(2022, 2, 18, 11, 45), "Solar Electric", 2125.0, "S-Band", 81250000.0, 15.0, "Spectrometer", "Radar", 425, false, "Failed", 25.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-326", "Mission-326", "Jupiter", "ISRO", 3760.0, LocalDateTime.of(2021, 3, 19, 10, 30), LocalDateTime.of(2023, 3, 19, 11, 45), "Ion", 2130.0, "Ka-Band", 81500000.0, 16.0, "Radar", "Magnetometer", 426, true, "Aborted", 26.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-327", "Mission-327", "Saturn", "ESA", 3770.0, LocalDateTime.of(2022, 4, 20, 10, 30), LocalDateTime.of(2024, 4, 20, 11, 45), "Nuclear", 2135.0, "X-Band", 81750000.0, 17.0, "Magnetometer", "Camera", 427, false, "In Progress", 27.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-328", "Mission-328", "Venus", "JAXA", 3780.0, LocalDateTime.of(2023, 5, 21, 10, 30), LocalDateTime.of(2025, 5, 21, 11, 45), "Chemical", 2140.0, "S-Band", 82000000.0, 18.0, "Camera", "Spectrometer", 428, true, "Success", 28.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-329", "Mission-329", "Pluto", "SpaceX", 3790.0, LocalDateTime.of(2024, 6, 22, 10, 30), LocalDateTime.of(2026, 6, 22, 11, 45), "Solar Electric", 2145.0, "Ka-Band", 82250000.0, 19.0, "Spectrometer", "Radar", 429, false, "Failed", 29.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-330", "Mission-330", "Mars", "NASA", 3800.0, LocalDateTime.of(2010, 7, 23, 10, 30), LocalDateTime.of(2012, 7, 23, 11, 45), "Ion", 2150.0, "X-Band", 82500000.0, 20.0, "Radar", "Magnetometer", 430, true, "Aborted", 30.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-331", "Mission-331", "Moon", "ISRO", 3810.0, LocalDateTime.of(2011, 8, 24, 10, 30), LocalDateTime.of(2013, 8, 24, 11, 45), "Nuclear", 2155.0, "S-Band", 82750000.0, 21.0, "Magnetometer", "Camera", 431, false, "In Progress", 31.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-332", "Mission-332", "Jupiter", "ESA", 3820.0, LocalDateTime.of(2012, 9, 25, 10, 30), LocalDateTime.of(2014, 9, 25, 11, 45), "Chemical", 2160.0, "Ka-Band", 83000000.0, 22.0, "Camera", "Spectrometer", 432, true, "Success", 32.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-333", "Mission-333", "Saturn", "JAXA", 3830.0, LocalDateTime.of(2013, 10, 26, 10, 30), LocalDateTime.of(2015, 10, 26, 11, 45), "Solar Electric", 2165.0, "X-Band", 83250000.0, 23.0, "Spectrometer", "Radar", 433, false, "Failed", 33.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-334", "Mission-334", "Venus", "SpaceX", 3840.0, LocalDateTime.of(2014, 11, 27, 10, 30), LocalDateTime.of(2016, 11, 27, 11, 45), "Ion", 2170.0, "S-Band", 83500000.0, 24.0, "Radar", "Magnetometer", 434, true, "Aborted", 34.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-335", "Mission-335", "Pluto", "NASA", 3850.0, LocalDateTime.of(2015, 12, 28, 10, 30), LocalDateTime.of(2017, 12, 28, 11, 45), "Nuclear", 2175.0, "Ka-Band", 83750000.0, 25.0, "Magnetometer", "Camera", 435, false, "In Progress", 35.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-336", "Mission-336", "Mars", "ISRO", 3860.0, LocalDateTime.of(2016, 1, 1, 10, 30), LocalDateTime.of(2018, 1, 1, 11, 45), "Chemical", 2180.0, "X-Band", 84000000.0, 26.0, "Camera", "Spectrometer", 436, true, "Success", 36.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-337", "Mission-337", "Moon", "ESA", 3870.0, LocalDateTime.of(2017, 2, 2, 10, 30), LocalDateTime.of(2019, 2, 2, 11, 45), "Solar Electric", 2185.0, "S-Band", 84250000.0, 27.0, "Spectrometer", "Radar", 437, false, "Failed", 37.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-338", "Mission-338", "Jupiter", "JAXA", 3880.0, LocalDateTime.of(2018, 3, 3, 10, 30), LocalDateTime.of(2020, 3, 3, 11, 45), "Ion", 2190.0, "Ka-Band", 84500000.0, 28.0, "Radar", "Magnetometer", 438, true, "Aborted", 38.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-339", "Mission-339", "Saturn", "SpaceX", 3890.0, LocalDateTime.of(2019, 4, 4, 10, 30), LocalDateTime.of(2021, 4, 4, 11, 45), "Nuclear", 2195.0, "X-Band", 84750000.0, 29.0, "Magnetometer", "Camera", 439, false, "In Progress", 39.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-340", "Mission-340", "Venus", "NASA", 3900.0, LocalDateTime.of(2020, 5, 5, 10, 30), LocalDateTime.of(2022, 5, 5, 11, 45), "Chemical", 2200.0, "S-Band", 85000000.0, 30.0, "Camera", "Spectrometer", 440, true, "Success", 40.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-341", "Mission-341", "Pluto", "ISRO", 3910.0, LocalDateTime.of(2021, 6, 6, 10, 30), LocalDateTime.of(2023, 6, 6, 11, 45), "Solar Electric", 2205.0, "Ka-Band", 85250000.0, 31.0, "Spectrometer", "Radar", 441, false, "Failed", 41.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-342", "Mission-342", "Mars", "ESA", 3920.0, LocalDateTime.of(2022, 7, 7, 10, 30), LocalDateTime.of(2024, 7, 7, 11, 45), "Ion", 2210.0, "X-Band", 85500000.0, 32.0, "Radar", "Magnetometer", 442, true, "Aborted", 42.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-343", "Mission-343", "Moon", "JAXA", 3930.0, LocalDateTime.of(2023, 8, 8, 10, 30), LocalDateTime.of(2025, 8, 8, 11, 45), "Nuclear", 2215.0, "S-Band", 85750000.0, 33.0, "Magnetometer", "Camera", 443, false, "In Progress", 43.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-344", "Mission-344", "Jupiter", "SpaceX", 3940.0, LocalDateTime.of(2024, 9, 9, 10, 30), LocalDateTime.of(2026, 9, 9, 11, 45), "Chemical", 2220.0, "Ka-Band", 86000000.0, 34.0, "Camera", "Spectrometer", 444, true, "Success", 44.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-345", "Mission-345", "Saturn", "NASA", 3950.0, LocalDateTime.of(2010, 10, 10, 10, 30), LocalDateTime.of(2012, 10, 10, 11, 45), "Solar Electric", 2225.0, "X-Band", 86250000.0, 35.0, "Spectrometer", "Radar", 445, false, "Failed", 45.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-346", "Mission-346", "Venus", "ISRO", 3960.0, LocalDateTime.of(2011, 11, 11, 10, 30), LocalDateTime.of(2013, 11, 11, 11, 45), "Ion", 2230.0, "S-Band", 86500000.0, 36.0, "Radar", "Magnetometer", 446, true, "Aborted", 46.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-347", "Mission-347", "Pluto", "ESA", 3970.0, LocalDateTime.of(2012, 12, 12, 10, 30), LocalDateTime.of(2014, 12, 12, 11, 45), "Nuclear", 2235.0, "Ka-Band", 86750000.0, 37.0, "Magnetometer", "Camera", 447, false, "In Progress", 47.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-348", "Mission-348", "Mars", "JAXA", 3980.0, LocalDateTime.of(2013, 1, 13, 10, 30), LocalDateTime.of(2015, 1, 13, 11, 45), "Chemical", 2240.0, "X-Band", 87000000.0, 38.0, "Camera", "Spectrometer", 448, true, "Success", 48.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-349", "Mission-349", "Moon", "SpaceX", 3990.0, LocalDateTime.of(2014, 2, 14, 10, 30), LocalDateTime.of(2016, 2, 14, 11, 45), "Solar Electric", 2245.0, "S-Band", 87250000.0, 39.0, "Spectrometer", "Radar", 449, false, "Failed", 49.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-350", "Mission-350", "Jupiter", "NASA", 4000.0, LocalDateTime.of(2015, 3, 15, 10, 30), LocalDateTime.of(2017, 3, 15, 11, 45), "Ion", 2250.0, "Ka-Band", 87500000.0, 40.0, "Radar", "Magnetometer", 450, true, "Aborted", 50.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-351", "Mission-351", "Saturn", "ISRO", 4010.0, LocalDateTime.of(2016, 4, 16, 10, 30), LocalDateTime.of(2018, 4, 16, 11, 45), "Nuclear", 2255.0, "X-Band", 87750000.0, 41.0, "Magnetometer", "Camera", 451, false, "In Progress", 51.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-352", "Mission-352", "Venus", "ESA", 4020.0, LocalDateTime.of(2017, 5, 17, 10, 30), LocalDateTime.of(2019, 5, 17, 11, 45), "Chemical", 2260.0, "S-Band", 88000000.0, 42.0, "Camera", "Spectrometer", 452, true, "Success", 52.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-353", "Mission-353", "Pluto", "JAXA", 4030.0, LocalDateTime.of(2018, 6, 18, 10, 30), LocalDateTime.of(2020, 6, 18, 11, 45), "Solar Electric", 2265.0, "Ka-Band", 88250000.0, 43.0, "Spectrometer", "Radar", 453, false, "Failed", 53.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-354", "Mission-354", "Mars", "SpaceX", 4040.0, LocalDateTime.of(2019, 7, 19, 10, 30), LocalDateTime.of(2021, 7, 19, 11, 45), "Ion", 2270.0, "X-Band", 88500000.0, 44.0, "Radar", "Magnetometer", 454, true, "Aborted", 54.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-355", "Mission-355", "Moon", "NASA", 4050.0, LocalDateTime.of(2020, 8, 20, 10, 30), LocalDateTime.of(2022, 8, 20, 11, 45), "Nuclear", 2275.0, "S-Band", 88750000.0, 45.0, "Magnetometer", "Camera", 455, false, "In Progress", 55.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-356", "Mission-356", "Jupiter", "ISRO", 4060.0, LocalDateTime.of(2021, 9, 21, 10, 30), LocalDateTime.of(2023, 9, 21, 11, 45), "Chemical", 2280.0, "Ka-Band", 89000000.0, 46.0, "Camera", "Spectrometer", 456, true, "Success", 56.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-357", "Mission-357", "Saturn", "ESA", 4070.0, LocalDateTime.of(2022, 10, 22, 10, 30), LocalDateTime.of(2024, 10, 22, 11, 45), "Solar Electric", 2285.0, "X-Band", 89250000.0, 47.0, "Spectrometer", "Radar", 457, false, "Failed", 57.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-358", "Mission-358", "Venus", "JAXA", 4080.0, LocalDateTime.of(2023, 11, 23, 10, 30), LocalDateTime.of(2025, 11, 23, 11, 45), "Ion", 2290.0, "S-Band", 89500000.0, 48.0, "Radar", "Magnetometer", 458, true, "Aborted", 58.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-359", "Mission-359", "Pluto", "SpaceX", 4090.0, LocalDateTime.of(2024, 12, 24, 10, 30), LocalDateTime.of(2026, 12, 24, 11, 45), "Nuclear", 2295.0, "Ka-Band", 89750000.0, 49.0, "Magnetometer", "Camera", 459, false, "In Progress", 59.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-360", "Mission-360", "Mars", "NASA", 4100.0, LocalDateTime.of(2010, 1, 25, 10, 30), LocalDateTime.of(2012, 1, 25, 11, 45), "Chemical", 2300.0, "X-Band", 90000000.0, 10.0, "Camera", "Spectrometer", 460, true, "Success", 60.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-361", "Mission-361", "Moon", "ISRO", 4110.0, LocalDateTime.of(2011, 2, 26, 10, 30), LocalDateTime.of(2013, 2, 26, 11, 45), "Solar Electric", 2305.0, "S-Band", 90250000.0, 11.0, "Spectrometer", "Radar", 461, false, "Failed", 61.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-362", "Mission-362", "Jupiter", "ESA", 4120.0, LocalDateTime.of(2012, 3, 27, 10, 30), LocalDateTime.of(2014, 3, 27, 11, 45), "Ion", 2310.0, "Ka-Band", 90500000.0, 12.0, "Radar", "Magnetometer", 462, true, "Aborted", 62.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-363", "Mission-363", "Saturn", "JAXA", 4130.0, LocalDateTime.of(2013, 4, 28, 10, 30), LocalDateTime.of(2015, 4, 28, 11, 45), "Nuclear", 2315.0, "X-Band", 90750000.0, 13.0, "Magnetometer", "Camera", 463, false, "In Progress", 63.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-364", "Mission-364", "Venus", "SpaceX", 4140.0, LocalDateTime.of(2014, 5, 1, 10, 30), LocalDateTime.of(2016, 5, 1, 11, 45), "Chemical", 2320.0, "S-Band", 91000000.0, 14.0, "Camera", "Spectrometer", 464, true, "Success", 64.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-365", "Mission-365", "Pluto", "NASA", 4150.0, LocalDateTime.of(2015, 6, 2, 10, 30), LocalDateTime.of(2017, 6, 2, 11, 45), "Solar Electric", 2325.0, "Ka-Band", 91250000.0, 15.0, "Spectrometer", "Radar", 465, false, "Failed", 65.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-366", "Mission-366", "Mars", "ISRO", 4160.0, LocalDateTime.of(2016, 7, 3, 10, 30), LocalDateTime.of(2018, 7, 3, 11, 45), "Ion", 2330.0, "X-Band", 91500000.0, 16.0, "Radar", "Magnetometer", 466, true, "Aborted", 66.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-367", "Mission-367", "Moon", "ESA", 4170.0, LocalDateTime.of(2017, 8, 4, 10, 30), LocalDateTime.of(2019, 8, 4, 11, 45), "Nuclear", 2335.0, "S-Band", 91750000.0, 17.0, "Magnetometer", "Camera", 467, false, "In Progress", 67.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-368", "Mission-368", "Jupiter", "JAXA", 4180.0, LocalDateTime.of(2018, 9, 5, 10, 30), LocalDateTime.of(2020, 9, 5, 11, 45), "Chemical", 2340.0, "Ka-Band", 92000000.0, 18.0, "Camera", "Spectrometer", 468, true, "Success", 68.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-369", "Mission-369", "Saturn", "SpaceX", 4190.0, LocalDateTime.of(2019, 10, 6, 10, 30), LocalDateTime.of(2021, 10, 6, 11, 45), "Solar Electric", 2345.0, "X-Band", 92250000.0, 19.0, "Spectrometer", "Radar", 469, false, "Failed", 69.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-370", "Mission-370", "Venus", "NASA", 4200.0, LocalDateTime.of(2020, 11, 7, 10, 30), LocalDateTime.of(2022, 11, 7, 11, 45), "Ion", 2350.0, "S-Band", 92500000.0, 20.0, "Radar", "Magnetometer", 470, true, "Aborted", 70.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-371", "Mission-371", "Pluto", "ISRO", 4210.0, LocalDateTime.of(2021, 12, 8, 10, 30), LocalDateTime.of(2023, 12, 8, 11, 45), "Nuclear", 2355.0, "Ka-Band", 92750000.0, 21.0, "Magnetometer", "Camera", 471, false, "In Progress", 71.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-372", "Mission-372", "Mars", "ESA", 4220.0, LocalDateTime.of(2022, 1, 9, 10, 30), LocalDateTime.of(2024, 1, 9, 11, 45), "Chemical", 2360.0, "X-Band", 93000000.0, 22.0, "Camera", "Spectrometer", 472, true, "Success", 72.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-373", "Mission-373", "Moon", "JAXA", 4230.0, LocalDateTime.of(2023, 2, 10, 10, 30), LocalDateTime.of(2025, 2, 10, 11, 45), "Solar Electric", 2365.0, "S-Band", 93250000.0, 23.0, "Spectrometer", "Radar", 473, false, "Failed", 73.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-374", "Mission-374", "Jupiter", "SpaceX", 4240.0, LocalDateTime.of(2024, 3, 11, 10, 30), LocalDateTime.of(2026, 3, 11, 11, 45), "Ion", 2370.0, "Ka-Band", 93500000.0, 24.0, "Radar", "Magnetometer", 474, true, "Aborted", 74.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-375", "Mission-375", "Saturn", "NASA", 4250.0, LocalDateTime.of(2010, 4, 12, 10, 30), LocalDateTime.of(2012, 4, 12, 11, 45), "Nuclear", 2375.0, "X-Band", 93750000.0, 25.0, "Magnetometer", "Camera", 475, false, "In Progress", 75.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-376", "Mission-376", "Venus", "ISRO", 4260.0, LocalDateTime.of(2011, 5, 13, 10, 30), LocalDateTime.of(2013, 5, 13, 11, 45), "Chemical", 2380.0, "S-Band", 94000000.0, 26.0, "Camera", "Spectrometer", 476, true, "Success", 76.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-377", "Mission-377", "Pluto", "ESA", 4270.0, LocalDateTime.of(2012, 6, 14, 10, 30), LocalDateTime.of(2014, 6, 14, 11, 45), "Solar Electric", 2385.0, "Ka-Band", 94250000.0, 27.0, "Spectrometer", "Radar", 477, false, "Failed", 77.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-378", "Mission-378", "Mars", "JAXA", 4280.0, LocalDateTime.of(2013, 7, 15, 10, 30), LocalDateTime.of(2015, 7, 15, 11, 45), "Ion", 2390.0, "X-Band", 94500000.0, 28.0, "Radar", "Magnetometer", 478, true, "Aborted", 78.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-379", "Mission-379", "Moon", "SpaceX", 4290.0, LocalDateTime.of(2014, 8, 16, 10, 30), LocalDateTime.of(2016, 8, 16, 11, 45), "Nuclear", 2395.0, "S-Band", 94750000.0, 29.0, "Magnetometer", "Camera", 479, false, "In Progress", 79.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-380", "Mission-380", "Jupiter", "NASA", 4300.0, LocalDateTime.of(2015, 9, 17, 10, 30), LocalDateTime.of(2017, 9, 17, 11, 45), "Chemical", 2400.0, "Ka-Band", 95000000.0, 30.0, "Camera", "Spectrometer", 480, true, "Success", 80.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-381", "Mission-381", "Saturn", "ISRO", 4310.0, LocalDateTime.of(2016, 10, 18, 10, 30), LocalDateTime.of(2018, 10, 18, 11, 45), "Solar Electric", 2405.0, "X-Band", 95250000.0, 31.0, "Spectrometer", "Radar", 481, false, "Failed", 81.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-382", "Mission-382", "Venus", "ESA", 4320.0, LocalDateTime.of(2017, 11, 19, 10, 30), LocalDateTime.of(2019, 11, 19, 11, 45), "Ion", 2410.0, "S-Band", 95500000.0, 32.0, "Radar", "Magnetometer", 482, true, "Aborted", 82.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-383", "Mission-383", "Pluto", "JAXA", 4330.0, LocalDateTime.of(2018, 12, 20, 10, 30), LocalDateTime.of(2020, 12, 20, 11, 45), "Nuclear", 2415.0, "Ka-Band", 95750000.0, 33.0, "Magnetometer", "Camera", 483, false, "In Progress", 83.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-384", "Mission-384", "Mars", "SpaceX", 4340.0, LocalDateTime.of(2019, 1, 21, 10, 30), LocalDateTime.of(2021, 1, 21, 11, 45), "Chemical", 2420.0, "X-Band", 96000000.0, 34.0, "Camera", "Spectrometer", 484, true, "Success", 84.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-385", "Mission-385", "Moon", "NASA", 4350.0, LocalDateTime.of(2020, 2, 22, 10, 30), LocalDateTime.of(2022, 2, 22, 11, 45), "Solar Electric", 2425.0, "S-Band", 96250000.0, 35.0, "Spectrometer", "Radar", 485, false, "Failed", 85.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-386", "Mission-386", "Jupiter", "ISRO", 4360.0, LocalDateTime.of(2021, 3, 23, 10, 30), LocalDateTime.of(2023, 3, 23, 11, 45), "Ion", 2430.0, "Ka-Band", 96500000.0, 36.0, "Radar", "Magnetometer", 486, true, "Aborted", 86.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-387", "Mission-387", "Saturn", "ESA", 4370.0, LocalDateTime.of(2022, 4, 24, 10, 30), LocalDateTime.of(2024, 4, 24, 11, 45), "Nuclear", 2435.0, "X-Band", 96750000.0, 37.0, "Magnetometer", "Camera", 487, false, "In Progress", 87.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-388", "Mission-388", "Venus", "JAXA", 4380.0, LocalDateTime.of(2023, 5, 25, 10, 30), LocalDateTime.of(2025, 5, 25, 11, 45), "Chemical", 2440.0, "S-Band", 97000000.0, 38.0, "Camera", "Spectrometer", 488, true, "Success", 88.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-389", "Mission-389", "Pluto", "SpaceX", 4390.0, LocalDateTime.of(2024, 6, 26, 10, 30), LocalDateTime.of(2026, 6, 26, 11, 45), "Solar Electric", 2445.0, "Ka-Band", 97250000.0, 39.0, "Spectrometer", "Radar", 489, false, "Failed", 89.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-390", "Mission-390", "Mars", "NASA", 4400.0, LocalDateTime.of(2010, 7, 27, 10, 30), LocalDateTime.of(2012, 7, 27, 11, 45), "Ion", 2450.0, "X-Band", 97500000.0, 40.0, "Radar", "Magnetometer", 490, true, "Aborted", 90.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-391", "Mission-391", "Moon", "ISRO", 4410.0, LocalDateTime.of(2011, 8, 28, 10, 30), LocalDateTime.of(2013, 8, 28, 11, 45), "Nuclear", 2455.0, "S-Band", 97750000.0, 41.0, "Magnetometer", "Camera", 491, false, "In Progress", 91.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-392", "Mission-392", "Jupiter", "ESA", 4420.0, LocalDateTime.of(2012, 9, 1, 10, 30), LocalDateTime.of(2014, 9, 1, 11, 45), "Chemical", 2460.0, "Ka-Band", 98000000.0, 42.0, "Camera", "Spectrometer", 492, true, "Success", 92.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-393", "Mission-393", "Saturn", "JAXA", 4430.0, LocalDateTime.of(2013, 10, 2, 10, 30), LocalDateTime.of(2015, 10, 2, 11, 45), "Solar Electric", 2465.0, "X-Band", 98250000.0, 43.0, "Spectrometer", "Radar", 493, false, "Failed", 93.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-394", "Mission-394", "Venus", "SpaceX", 4440.0, LocalDateTime.of(2014, 11, 3, 10, 30), LocalDateTime.of(2016, 11, 3, 11, 45), "Ion", 2470.0, "S-Band", 98500000.0, 44.0, "Radar", "Magnetometer", 494, true, "Aborted", 94.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-395", "Mission-395", "Pluto", "NASA", 4450.0, LocalDateTime.of(2015, 12, 4, 10, 30), LocalDateTime.of(2017, 12, 4, 11, 45), "Nuclear", 2475.0, "Ka-Band", 98750000.0, 45.0, "Magnetometer", "Camera", 495, false, "In Progress", 95.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-396", "Mission-396", "Mars", "ISRO", 4460.0, LocalDateTime.of(2016, 1, 5, 10, 30), LocalDateTime.of(2018, 1, 5, 11, 45), "Chemical", 2480.0, "X-Band", 99000000.0, 46.0, "Camera", "Spectrometer", 496, true, "Success", 96.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-397", "Mission-397", "Moon", "ESA", 4470.0, LocalDateTime.of(2017, 2, 6, 10, 30), LocalDateTime.of(2019, 2, 6, 11, 45), "Solar Electric", 2485.0, "S-Band", 99250000.0, 47.0, "Spectrometer", "Radar", 497, false, "Failed", 97.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-398", "Mission-398", "Jupiter", "JAXA", 4480.0, LocalDateTime.of(2018, 3, 7, 10, 30), LocalDateTime.of(2020, 3, 7, 11, 45), "Ion", 2490.0, "Ka-Band", 99500000.0, 48.0, "Radar", "Magnetometer", 498, true, "Aborted", 98.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-399", "Mission-399", "Saturn", "SpaceX", 4490.0, LocalDateTime.of(2019, 4, 8, 10, 30), LocalDateTime.of(2021, 4, 8, 11, 45), "Nuclear", 2495.0, "X-Band", 99750000.0, 49.0, "Magnetometer", "Camera", 499, false, "In Progress", 99.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-400", "Mission-400", "Venus", "NASA", 4500.0, LocalDateTime.of(2020, 5, 9, 10, 30), LocalDateTime.of(2022, 5, 9, 11, 45), "Chemical", 2500.0, "S-Band", 100000000.0, 10.0, "Camera", "Spectrometer", 500, true, "Success", 0.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-401", "Mission-401", "Pluto", "ISRO", 4510.0, LocalDateTime.of(2021, 6, 10, 10, 30), LocalDateTime.of(2023, 6, 10, 11, 45), "Solar Electric", 2505.0, "Ka-Band", 100250000.0, 11.0, "Spectrometer", "Radar", 501, false, "Failed", 1.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-402", "Mission-402", "Mars", "ESA", 4520.0, LocalDateTime.of(2022, 7, 11, 10, 30), LocalDateTime.of(2024, 7, 11, 11, 45), "Ion", 2510.0, "X-Band", 100500000.0, 12.0, "Radar", "Magnetometer", 502, true, "Aborted", 2.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-403", "Mission-403", "Moon", "JAXA", 4530.0, LocalDateTime.of(2023, 8, 12, 10, 30), LocalDateTime.of(2025, 8, 12, 11, 45), "Nuclear", 2515.0, "S-Band", 100750000.0, 13.0, "Magnetometer", "Camera", 503, false, "In Progress", 3.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-404", "Mission-404", "Jupiter", "SpaceX", 4540.0, LocalDateTime.of(2024, 9, 13, 10, 30), LocalDateTime.of(2026, 9, 13, 11, 45), "Chemical", 2520.0, "Ka-Band", 101000000.0, 14.0, "Camera", "Spectrometer", 504, true, "Success", 4.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-405", "Mission-405", "Saturn", "NASA", 4550.0, LocalDateTime.of(2010, 10, 14, 10, 30), LocalDateTime.of(2012, 10, 14, 11, 45), "Solar Electric", 2525.0, "X-Band", 101250000.0, 15.0, "Spectrometer", "Radar", 505, false, "Failed", 5.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-406", "Mission-406", "Venus", "ISRO", 4560.0, LocalDateTime.of(2011, 11, 15, 10, 30), LocalDateTime.of(2013, 11, 15, 11, 45), "Ion", 2530.0, "S-Band", 101500000.0, 16.0, "Radar", "Magnetometer", 506, true, "Aborted", 6.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-407", "Mission-407", "Pluto", "ESA", 4570.0, LocalDateTime.of(2012, 12, 16, 10, 30), LocalDateTime.of(2014, 12, 16, 11, 45), "Nuclear", 2535.0, "Ka-Band", 101750000.0, 17.0, "Magnetometer", "Camera", 507, false, "In Progress", 7.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-408", "Mission-408", "Mars", "JAXA", 4580.0, LocalDateTime.of(2013, 1, 17, 10, 30), LocalDateTime.of(2015, 1, 17, 11, 45), "Chemical", 2540.0, "X-Band", 102000000.0, 18.0, "Camera", "Spectrometer", 508, true, "Success", 8.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-409", "Mission-409", "Moon", "SpaceX", 4590.0, LocalDateTime.of(2014, 2, 18, 10, 30), LocalDateTime.of(2016, 2, 18, 11, 45), "Solar Electric", 2545.0, "S-Band", 102250000.0, 19.0, "Spectrometer", "Radar", 509, false, "Failed", 9.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-410", "Mission-410", "Jupiter", "NASA", 4600.0, LocalDateTime.of(2015, 3, 19, 10, 30), LocalDateTime.of(2017, 3, 19, 11, 45), "Ion", 2550.0, "Ka-Band", 102500000.0, 20.0, "Radar", "Magnetometer", 510, true, "Aborted", 10.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-411", "Mission-411", "Saturn", "ISRO", 4610.0, LocalDateTime.of(2016, 4, 20, 10, 30), LocalDateTime.of(2018, 4, 20, 11, 45), "Nuclear", 2555.0, "X-Band", 102750000.0, 21.0, "Magnetometer", "Camera", 511, false, "In Progress", 11.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-412", "Mission-412", "Venus", "ESA", 4620.0, LocalDateTime.of(2017, 5, 21, 10, 30), LocalDateTime.of(2019, 5, 21, 11, 45), "Chemical", 2560.0, "S-Band", 103000000.0, 22.0, "Camera", "Spectrometer", 512, true, "Success", 12.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-413", "Mission-413", "Pluto", "JAXA", 4630.0, LocalDateTime.of(2018, 6, 22, 10, 30), LocalDateTime.of(2020, 6, 22, 11, 45), "Solar Electric", 2565.0, "Ka-Band", 103250000.0, 23.0, "Spectrometer", "Radar", 513, false, "Failed", 13.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-414", "Mission-414", "Mars", "SpaceX", 4640.0, LocalDateTime.of(2019, 7, 23, 10, 30), LocalDateTime.of(2021, 7, 23, 11, 45), "Ion", 2570.0, "X-Band", 103500000.0, 24.0, "Radar", "Magnetometer", 514, true, "Aborted", 14.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-415", "Mission-415", "Moon", "NASA", 4650.0, LocalDateTime.of(2020, 8, 24, 10, 30), LocalDateTime.of(2022, 8, 24, 11, 45), "Nuclear", 2575.0, "S-Band", 103750000.0, 25.0, "Magnetometer", "Camera", 515, false, "In Progress", 15.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-416", "Mission-416", "Jupiter", "ISRO", 4660.0, LocalDateTime.of(2021, 9, 25, 10, 30), LocalDateTime.of(2023, 9, 25, 11, 45), "Chemical", 2580.0, "Ka-Band", 104000000.0, 26.0, "Camera", "Spectrometer", 516, true, "Success", 16.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-417", "Mission-417", "Saturn", "ESA", 4670.0, LocalDateTime.of(2022, 10, 26, 10, 30), LocalDateTime.of(2024, 10, 26, 11, 45), "Solar Electric", 2585.0, "X-Band", 104250000.0, 27.0, "Spectrometer", "Radar", 517, false, "Failed", 17.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-418", "Mission-418", "Venus", "JAXA", 4680.0, LocalDateTime.of(2023, 11, 27, 10, 30), LocalDateTime.of(2025, 11, 27, 11, 45), "Ion", 2590.0, "S-Band", 104500000.0, 28.0, "Radar", "Magnetometer", 518, true, "Aborted", 18.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-419", "Mission-419", "Pluto", "SpaceX", 4690.0, LocalDateTime.of(2024, 12, 28, 10, 30), LocalDateTime.of(2026, 12, 28, 11, 45), "Nuclear", 2595.0, "Ka-Band", 104750000.0, 29.0, "Magnetometer", "Camera", 519, false, "In Progress", 19.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-420", "Mission-420", "Mars", "NASA", 4700.0, LocalDateTime.of(2010, 1, 1, 10, 30), LocalDateTime.of(2012, 1, 1, 11, 45), "Chemical", 2600.0, "X-Band", 105000000.0, 30.0, "Camera", "Spectrometer", 520, true, "Success", 20.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-421", "Mission-421", "Moon", "ISRO", 4710.0, LocalDateTime.of(2011, 2, 2, 10, 30), LocalDateTime.of(2013, 2, 2, 11, 45), "Solar Electric", 2605.0, "S-Band", 105250000.0, 31.0, "Spectrometer", "Radar", 521, false, "Failed", 21.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-422", "Mission-422", "Jupiter", "ESA", 4720.0, LocalDateTime.of(2012, 3, 3, 10, 30), LocalDateTime.of(2014, 3, 3, 11, 45), "Ion", 2610.0, "Ka-Band", 105500000.0, 32.0, "Radar", "Magnetometer", 522, true, "Aborted", 22.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-423", "Mission-423", "Saturn", "JAXA", 4730.0, LocalDateTime.of(2013, 4, 4, 10, 30), LocalDateTime.of(2015, 4, 4, 11, 45), "Nuclear", 2615.0, "X-Band", 105750000.0, 33.0, "Magnetometer", "Camera", 523, false, "In Progress", 23.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-424", "Mission-424", "Venus", "SpaceX", 4740.0, LocalDateTime.of(2014, 5, 5, 10, 30), LocalDateTime.of(2016, 5, 5, 11, 45), "Chemical", 2620.0, "S-Band", 106000000.0, 34.0, "Camera", "Spectrometer", 524, true, "Success", 24.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-425", "Mission-425", "Pluto", "NASA", 4750.0, LocalDateTime.of(2015, 6, 6, 10, 30), LocalDateTime.of(2017, 6, 6, 11, 45), "Solar Electric", 2625.0, "Ka-Band", 106250000.0, 35.0, "Spectrometer", "Radar", 525, false, "Failed", 25.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-426", "Mission-426", "Mars", "ISRO", 4760.0, LocalDateTime.of(2016, 7, 7, 10, 30), LocalDateTime.of(2018, 7, 7, 11, 45), "Ion", 2630.0, "X-Band", 106500000.0, 36.0, "Radar", "Magnetometer", 526, true, "Aborted", 26.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-427", "Mission-427", "Moon", "ESA", 4770.0, LocalDateTime.of(2017, 8, 8, 10, 30), LocalDateTime.of(2019, 8, 8, 11, 45), "Nuclear", 2635.0, "S-Band", 106750000.0, 37.0, "Magnetometer", "Camera", 527, false, "In Progress", 27.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-428", "Mission-428", "Jupiter", "JAXA", 4780.0, LocalDateTime.of(2018, 9, 9, 10, 30), LocalDateTime.of(2020, 9, 9, 11, 45), "Chemical", 2640.0, "Ka-Band", 107000000.0, 38.0, "Camera", "Spectrometer", 528, true, "Success", 28.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-429", "Mission-429", "Saturn", "SpaceX", 4790.0, LocalDateTime.of(2019, 10, 10, 10, 30), LocalDateTime.of(2021, 10, 10, 11, 45), "Solar Electric", 2645.0, "X-Band", 107250000.0, 39.0, "Spectrometer", "Radar", 529, false, "Failed", 29.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-430", "Mission-430", "Venus", "NASA", 4800.0, LocalDateTime.of(2020, 11, 11, 10, 30), LocalDateTime.of(2022, 11, 11, 11, 45), "Ion", 2650.0, "S-Band", 107500000.0, 40.0, "Radar", "Magnetometer", 530, true, "Aborted", 30.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-431", "Mission-431", "Pluto", "ISRO", 4810.0, LocalDateTime.of(2021, 12, 12, 10, 30), LocalDateTime.of(2023, 12, 12, 11, 45), "Nuclear", 2655.0, "Ka-Band", 107750000.0, 41.0, "Magnetometer", "Camera", 531, false, "In Progress", 31.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-432", "Mission-432", "Mars", "ESA", 4820.0, LocalDateTime.of(2022, 1, 13, 10, 30), LocalDateTime.of(2024, 1, 13, 11, 45), "Chemical", 2660.0, "X-Band", 108000000.0, 42.0, "Camera", "Spectrometer", 532, true, "Success", 32.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-433", "Mission-433", "Moon", "JAXA", 4830.0, LocalDateTime.of(2023, 2, 14, 10, 30), LocalDateTime.of(2025, 2, 14, 11, 45), "Solar Electric", 2665.0, "S-Band", 108250000.0, 43.0, "Spectrometer", "Radar", 533, false, "Failed", 33.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-434", "Mission-434", "Jupiter", "SpaceX", 4840.0, LocalDateTime.of(2024, 3, 15, 10, 30), LocalDateTime.of(2026, 3, 15, 11, 45), "Ion", 2670.0, "Ka-Band", 108500000.0, 44.0, "Radar", "Magnetometer", 534, true, "Aborted", 34.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-435", "Mission-435", "Saturn", "NASA", 4850.0, LocalDateTime.of(2010, 4, 16, 10, 30), LocalDateTime.of(2012, 4, 16, 11, 45), "Nuclear", 2675.0, "X-Band", 108750000.0, 45.0, "Magnetometer", "Camera", 535, false, "In Progress", 35.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-436", "Mission-436", "Venus", "ISRO", 4860.0, LocalDateTime.of(2011, 5, 17, 10, 30), LocalDateTime.of(2013, 5, 17, 11, 45), "Chemical", 2680.0, "S-Band", 109000000.0, 46.0, "Camera", "Spectrometer", 536, true, "Success", 36.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-437", "Mission-437", "Pluto", "ESA", 4870.0, LocalDateTime.of(2012, 6, 18, 10, 30), LocalDateTime.of(2014, 6, 18, 11, 45), "Solar Electric", 2685.0, "Ka-Band", 109250000.0, 47.0, "Spectrometer", "Radar", 537, false, "Failed", 37.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-438", "Mission-438", "Mars", "JAXA", 4880.0, LocalDateTime.of(2013, 7, 19, 10, 30), LocalDateTime.of(2015, 7, 19, 11, 45), "Ion", 2690.0, "X-Band", 109500000.0, 48.0, "Radar", "Magnetometer", 538, true, "Aborted", 38.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-439", "Mission-439", "Moon", "SpaceX", 4890.0, LocalDateTime.of(2014, 8, 20, 10, 30), LocalDateTime.of(2016, 8, 20, 11, 45), "Nuclear", 2695.0, "S-Band", 109750000.0, 49.0, "Magnetometer", "Camera", 539, false, "In Progress", 39.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-440", "Mission-440", "Jupiter", "NASA", 4900.0, LocalDateTime.of(2015, 9, 21, 10, 30), LocalDateTime.of(2017, 9, 21, 11, 45), "Chemical", 2700.0, "Ka-Band", 110000000.0, 10.0, "Camera", "Spectrometer", 540, true, "Success", 40.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-441", "Mission-441", "Saturn", "ISRO", 4910.0, LocalDateTime.of(2016, 10, 22, 10, 30), LocalDateTime.of(2018, 10, 22, 11, 45), "Solar Electric", 2705.0, "X-Band", 110250000.0, 11.0, "Spectrometer", "Radar", 541, false, "Failed", 41.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-442", "Mission-442", "Venus", "ESA", 4920.0, LocalDateTime.of(2017, 11, 23, 10, 30), LocalDateTime.of(2019, 11, 23, 11, 45), "Ion", 2710.0, "S-Band", 110500000.0, 12.0, "Radar", "Magnetometer", 542, true, "Aborted", 42.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-443", "Mission-443", "Pluto", "JAXA", 4930.0, LocalDateTime.of(2018, 12, 24, 10, 30), LocalDateTime.of(2020, 12, 24, 11, 45), "Nuclear", 2715.0, "Ka-Band", 110750000.0, 13.0, "Magnetometer", "Camera", 543, false, "In Progress", 43.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-444", "Mission-444", "Mars", "SpaceX", 4940.0, LocalDateTime.of(2019, 1, 25, 10, 30), LocalDateTime.of(2021, 1, 25, 11, 45), "Chemical", 2720.0, "X-Band", 111000000.0, 14.0, "Camera", "Spectrometer", 544, true, "Success", 44.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-445", "Mission-445", "Moon", "NASA", 4950.0, LocalDateTime.of(2020, 2, 26, 10, 30), LocalDateTime.of(2022, 2, 26, 11, 45), "Solar Electric", 2725.0, "S-Band", 111250000.0, 15.0, "Spectrometer", "Radar", 545, false, "Failed", 45.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-446", "Mission-446", "Jupiter", "ISRO", 4960.0, LocalDateTime.of(2021, 3, 27, 10, 30), LocalDateTime.of(2023, 3, 27, 11, 45), "Ion", 2730.0, "Ka-Band", 111500000.0, 16.0, "Radar", "Magnetometer", 546, true, "Aborted", 46.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-447", "Mission-447", "Saturn", "ESA", 4970.0, LocalDateTime.of(2022, 4, 28, 10, 30), LocalDateTime.of(2024, 4, 28, 11, 45), "Nuclear", 2735.0, "X-Band", 111750000.0, 17.0, "Magnetometer", "Camera", 547, false, "In Progress", 47.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-448", "Mission-448", "Venus", "JAXA", 4980.0, LocalDateTime.of(2023, 5, 1, 10, 30), LocalDateTime.of(2025, 5, 1, 11, 45), "Chemical", 2740.0, "S-Band", 112000000.0, 18.0, "Camera", "Spectrometer", 548, true, "Success", 48.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-449", "Mission-449", "Pluto", "SpaceX", 4990.0, LocalDateTime.of(2024, 6, 2, 10, 30), LocalDateTime.of(2026, 6, 2, 11, 45), "Solar Electric", 2745.0, "Ka-Band", 112250000.0, 19.0, "Spectrometer", "Radar", 549, false, "Failed", 49.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-450", "Mission-450", "Mars", "NASA", 5000.0, LocalDateTime.of(2010, 7, 3, 10, 30), LocalDateTime.of(2012, 7, 3, 11, 45), "Ion", 2750.0, "X-Band", 112500000.0, 20.0, "Radar", "Magnetometer", 550, true, "Aborted", 50.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-451", "Mission-451", "Moon", "ISRO", 5010.0, LocalDateTime.of(2011, 8, 4, 10, 30), LocalDateTime.of(2013, 8, 4, 11, 45), "Nuclear", 2755.0, "S-Band", 112750000.0, 21.0, "Magnetometer", "Camera", 551, false, "In Progress", 51.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-452", "Mission-452", "Jupiter", "ESA", 5020.0, LocalDateTime.of(2012, 9, 5, 10, 30), LocalDateTime.of(2014, 9, 5, 11, 45), "Chemical", 2760.0, "Ka-Band", 113000000.0, 22.0, "Camera", "Spectrometer", 552, true, "Success", 52.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-453", "Mission-453", "Saturn", "JAXA", 5030.0, LocalDateTime.of(2013, 10, 6, 10, 30), LocalDateTime.of(2015, 10, 6, 11, 45), "Solar Electric", 2765.0, "X-Band", 113250000.0, 23.0, "Spectrometer", "Radar", 553, false, "Failed", 53.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-454", "Mission-454", "Venus", "SpaceX", 5040.0, LocalDateTime.of(2014, 11, 7, 10, 30), LocalDateTime.of(2016, 11, 7, 11, 45), "Ion", 2770.0, "S-Band", 113500000.0, 24.0, "Radar", "Magnetometer", 554, true, "Aborted", 54.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-455", "Mission-455", "Pluto", "NASA", 5050.0, LocalDateTime.of(2015, 12, 8, 10, 30), LocalDateTime.of(2017, 12, 8, 11, 45), "Nuclear", 2775.0, "Ka-Band", 113750000.0, 25.0, "Magnetometer", "Camera", 555, false, "In Progress", 55.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-456", "Mission-456", "Mars", "ISRO", 5060.0, LocalDateTime.of(2016, 1, 9, 10, 30), LocalDateTime.of(2018, 1, 9, 11, 45), "Chemical", 2780.0, "X-Band", 114000000.0, 26.0, "Camera", "Spectrometer", 556, true, "Success", 56.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-457", "Mission-457", "Moon", "ESA", 5070.0, LocalDateTime.of(2017, 2, 10, 10, 30), LocalDateTime.of(2019, 2, 10, 11, 45), "Solar Electric", 2785.0, "S-Band", 114250000.0, 27.0, "Spectrometer", "Radar", 557, false, "Failed", 57.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-458", "Mission-458", "Jupiter", "JAXA", 5080.0, LocalDateTime.of(2018, 3, 11, 10, 30), LocalDateTime.of(2020, 3, 11, 11, 45), "Ion", 2790.0, "Ka-Band", 114500000.0, 28.0, "Radar", "Magnetometer", 558, true, "Aborted", 58.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-459", "Mission-459", "Saturn", "SpaceX", 5090.0, LocalDateTime.of(2019, 4, 12, 10, 30), LocalDateTime.of(2021, 4, 12, 11, 45), "Nuclear", 2795.0, "X-Band", 114750000.0, 29.0, "Magnetometer", "Camera", 559, false, "In Progress", 59.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-460", "Mission-460", "Venus", "NASA", 5100.0, LocalDateTime.of(2020, 5, 13, 10, 30), LocalDateTime.of(2022, 5, 13, 11, 45), "Chemical", 2800.0, "S-Band", 115000000.0, 30.0, "Camera", "Spectrometer", 560, true, "Success", 60.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-461", "Mission-461", "Pluto", "ISRO", 5110.0, LocalDateTime.of(2021, 6, 14, 10, 30), LocalDateTime.of(2023, 6, 14, 11, 45), "Solar Electric", 2805.0, "Ka-Band", 115250000.0, 31.0, "Spectrometer", "Radar", 561, false, "Failed", 61.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-462", "Mission-462", "Mars", "ESA", 5120.0, LocalDateTime.of(2022, 7, 15, 10, 30), LocalDateTime.of(2024, 7, 15, 11, 45), "Ion", 2810.0, "X-Band", 115500000.0, 32.0, "Radar", "Magnetometer", 562, true, "Aborted", 62.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-463", "Mission-463", "Moon", "JAXA", 5130.0, LocalDateTime.of(2023, 8, 16, 10, 30), LocalDateTime.of(2025, 8, 16, 11, 45), "Nuclear", 2815.0, "S-Band", 115750000.0, 33.0, "Magnetometer", "Camera", 563, false, "In Progress", 63.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-464", "Mission-464", "Jupiter", "SpaceX", 5140.0, LocalDateTime.of(2024, 9, 17, 10, 30), LocalDateTime.of(2026, 9, 17, 11, 45), "Chemical", 2820.0, "Ka-Band", 116000000.0, 34.0, "Camera", "Spectrometer", 564, true, "Success", 64.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-465", "Mission-465", "Saturn", "NASA", 5150.0, LocalDateTime.of(2010, 10, 18, 10, 30), LocalDateTime.of(2012, 10, 18, 11, 45), "Solar Electric", 2825.0, "X-Band", 116250000.0, 35.0, "Spectrometer", "Radar", 565, false, "Failed", 65.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-466", "Mission-466", "Venus", "ISRO", 5160.0, LocalDateTime.of(2011, 11, 19, 10, 30), LocalDateTime.of(2013, 11, 19, 11, 45), "Ion", 2830.0, "S-Band", 116500000.0, 36.0, "Radar", "Magnetometer", 566, true, "Aborted", 66.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-467", "Mission-467", "Pluto", "ESA", 5170.0, LocalDateTime.of(2012, 12, 20, 10, 30), LocalDateTime.of(2014, 12, 20, 11, 45), "Nuclear", 2835.0, "Ka-Band", 116750000.0, 37.0, "Magnetometer", "Camera", 567, false, "In Progress", 67.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-468", "Mission-468", "Mars", "JAXA", 5180.0, LocalDateTime.of(2013, 1, 21, 10, 30), LocalDateTime.of(2015, 1, 21, 11, 45), "Chemical", 2840.0, "X-Band", 117000000.0, 38.0, "Camera", "Spectrometer", 568, true, "Success", 68.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-469", "Mission-469", "Moon", "SpaceX", 5190.0, LocalDateTime.of(2014, 2, 22, 10, 30), LocalDateTime.of(2016, 2, 22, 11, 45), "Solar Electric", 2845.0, "S-Band", 117250000.0, 39.0, "Spectrometer", "Radar", 569, false, "Failed", 69.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-470", "Mission-470", "Jupiter", "NASA", 5200.0, LocalDateTime.of(2015, 3, 23, 10, 30), LocalDateTime.of(2017, 3, 23, 11, 45), "Ion", 2850.0, "Ka-Band", 117500000.0, 40.0, "Radar", "Magnetometer", 570, true, "Aborted", 70.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-471", "Mission-471", "Saturn", "ISRO", 5210.0, LocalDateTime.of(2016, 4, 24, 10, 30), LocalDateTime.of(2018, 4, 24, 11, 45), "Nuclear", 2855.0, "X-Band", 117750000.0, 41.0, "Magnetometer", "Camera", 571, false, "In Progress", 71.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-472", "Mission-472", "Venus", "ESA", 5220.0, LocalDateTime.of(2017, 5, 25, 10, 30), LocalDateTime.of(2019, 5, 25, 11, 45), "Chemical", 2860.0, "S-Band", 118000000.0, 42.0, "Camera", "Spectrometer", 572, true, "Success", 72.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-473", "Mission-473", "Pluto", "JAXA", 5230.0, LocalDateTime.of(2018, 6, 26, 10, 30), LocalDateTime.of(2020, 6, 26, 11, 45), "Solar Electric", 2865.0, "Ka-Band", 118250000.0, 43.0, "Spectrometer", "Radar", 573, false, "Failed", 73.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-474", "Mission-474", "Mars", "SpaceX", 5240.0, LocalDateTime.of(2019, 7, 27, 10, 30), LocalDateTime.of(2021, 7, 27, 11, 45), "Ion", 2870.0, "X-Band", 118500000.0, 44.0, "Radar", "Magnetometer", 574, true, "Aborted", 74.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-475", "Mission-475", "Moon", "NASA", 5250.0, LocalDateTime.of(2020, 8, 28, 10, 30), LocalDateTime.of(2022, 8, 28, 11, 45), "Nuclear", 2875.0, "S-Band", 118750000.0, 45.0, "Magnetometer", "Camera", 575, false, "In Progress", 75.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-476", "Mission-476", "Jupiter", "ISRO", 5260.0, LocalDateTime.of(2021, 9, 1, 10, 30), LocalDateTime.of(2023, 9, 1, 11, 45), "Chemical", 2880.0, "Ka-Band", 119000000.0, 46.0, "Camera", "Spectrometer", 576, true, "Success", 76.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-477", "Mission-477", "Saturn", "ESA", 5270.0, LocalDateTime.of(2022, 10, 2, 10, 30), LocalDateTime.of(2024, 10, 2, 11, 45), "Solar Electric", 2885.0, "X-Band", 119250000.0, 47.0, "Spectrometer", "Radar", 577, false, "Failed", 77.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-478", "Mission-478", "Venus", "JAXA", 5280.0, LocalDateTime.of(2023, 11, 3, 10, 30), LocalDateTime.of(2025, 11, 3, 11, 45), "Ion", 2890.0, "S-Band", 119500000.0, 48.0, "Radar", "Magnetometer", 578, true, "Aborted", 78.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-479", "Mission-479", "Pluto", "SpaceX", 5290.0, LocalDateTime.of(2024, 12, 4, 10, 30), LocalDateTime.of(2026, 12, 4, 11, 45), "Nuclear", 2895.0, "Ka-Band", 119750000.0, 49.0, "Magnetometer", "Camera", 579, false, "In Progress", 79.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-480", "Mission-480", "Mars", "NASA", 5300.0, LocalDateTime.of(2010, 1, 5, 10, 30), LocalDateTime.of(2012, 1, 5, 11, 45), "Chemical", 2900.0, "X-Band", 120000000.0, 10.0, "Camera", "Spectrometer", 580, true, "Success", 80.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-481", "Mission-481", "Moon", "ISRO", 5310.0, LocalDateTime.of(2011, 2, 6, 10, 30), LocalDateTime.of(2013, 2, 6, 11, 45), "Solar Electric", 2905.0, "S-Band", 120250000.0, 11.0, "Spectrometer", "Radar", 581, false, "Failed", 81.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-482", "Mission-482", "Jupiter", "ESA", 5320.0, LocalDateTime.of(2012, 3, 7, 10, 30), LocalDateTime.of(2014, 3, 7, 11, 45), "Ion", 2910.0, "Ka-Band", 120500000.0, 12.0, "Radar", "Magnetometer", 582, true, "Aborted", 82.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-483", "Mission-483", "Saturn", "JAXA", 5330.0, LocalDateTime.of(2013, 4, 8, 10, 30), LocalDateTime.of(2015, 4, 8, 11, 45), "Nuclear", 2915.0, "X-Band", 120750000.0, 13.0, "Magnetometer", "Camera", 583, false, "In Progress", 83.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-484", "Mission-484", "Venus", "SpaceX", 5340.0, LocalDateTime.of(2014, 5, 9, 10, 30), LocalDateTime.of(2016, 5, 9, 11, 45), "Chemical", 2920.0, "S-Band", 121000000.0, 14.0, "Camera", "Spectrometer", 584, true, "Success", 84.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-485", "Mission-485", "Pluto", "NASA", 5350.0, LocalDateTime.of(2015, 6, 10, 10, 30), LocalDateTime.of(2017, 6, 10, 11, 45), "Solar Electric", 2925.0, "Ka-Band", 121250000.0, 15.0, "Spectrometer", "Radar", 585, false, "Failed", 85.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-486", "Mission-486", "Mars", "ISRO", 5360.0, LocalDateTime.of(2016, 7, 11, 10, 30), LocalDateTime.of(2018, 7, 11, 11, 45), "Ion", 2930.0, "X-Band", 121500000.0, 16.0, "Radar", "Magnetometer", 586, true, "Aborted", 86.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-487", "Mission-487", "Moon", "ESA", 5370.0, LocalDateTime.of(2017, 8, 12, 10, 30), LocalDateTime.of(2019, 8, 12, 11, 45), "Nuclear", 2935.0, "S-Band", 121750000.0, 17.0, "Magnetometer", "Camera", 587, false, "In Progress", 87.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-488", "Mission-488", "Jupiter", "JAXA", 5380.0, LocalDateTime.of(2018, 9, 13, 10, 30), LocalDateTime.of(2020, 9, 13, 11, 45), "Chemical", 2940.0, "Ka-Band", 122000000.0, 18.0, "Camera", "Spectrometer", 588, true, "Success", 88.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-489", "Mission-489", "Saturn", "SpaceX", 5390.0, LocalDateTime.of(2019, 10, 14, 10, 30), LocalDateTime.of(2021, 10, 14, 11, 45), "Solar Electric", 2945.0, "X-Band", 122250000.0, 19.0, "Spectrometer", "Radar", 589, false, "Failed", 89.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-490", "Mission-490", "Venus", "NASA", 5400.0, LocalDateTime.of(2020, 11, 15, 10, 30), LocalDateTime.of(2022, 11, 15, 11, 45), "Ion", 2950.0, "S-Band", 122500000.0, 20.0, "Radar", "Magnetometer", 590, true, "Aborted", 90.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-491", "Mission-491", "Pluto", "ISRO", 5410.0, LocalDateTime.of(2021, 12, 16, 10, 30), LocalDateTime.of(2023, 12, 16, 11, 45), "Nuclear", 2955.0, "Ka-Band", 122750000.0, 21.0, "Magnetometer", "Camera", 591, false, "In Progress", 91.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-492", "Mission-492", "Mars", "ESA", 5420.0, LocalDateTime.of(2022, 1, 17, 10, 30), LocalDateTime.of(2024, 1, 17, 11, 45), "Chemical", 2960.0, "X-Band", 123000000.0, 22.0, "Camera", "Spectrometer", 592, true, "Success", 92.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-493", "Mission-493", "Moon", "JAXA", 5430.0, LocalDateTime.of(2023, 2, 18, 10, 30), LocalDateTime.of(2025, 2, 18, 11, 45), "Solar Electric", 2965.0, "S-Band", 123250000.0, 23.0, "Spectrometer", "Radar", 593, false, "Failed", 93.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-494", "Mission-494", "Jupiter", "SpaceX", 5440.0, LocalDateTime.of(2024, 3, 19, 10, 30), LocalDateTime.of(2026, 3, 19, 11, 45), "Ion", 2970.0, "Ka-Band", 123500000.0, 24.0, "Radar", "Magnetometer", 594, true, "Aborted", 94.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-495", "Mission-495", "Saturn", "NASA", 5450.0, LocalDateTime.of(2010, 4, 20, 10, 30), LocalDateTime.of(2012, 4, 20, 11, 45), "Nuclear", 2975.0, "X-Band", 123750000.0, 25.0, "Magnetometer", "Camera", 595, false, "In Progress", 95.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-496", "Mission-496", "Venus", "ISRO", 5460.0, LocalDateTime.of(2011, 5, 21, 10, 30), LocalDateTime.of(2013, 5, 21, 11, 45), "Chemical", 2980.0, "S-Band", 124000000.0, 26.0, "Camera", "Spectrometer", 596, true, "Success", 96.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-497", "Mission-497", "Pluto", "ESA", 5470.0, LocalDateTime.of(2012, 6, 22, 10, 30), LocalDateTime.of(2014, 6, 22, 11, 45), "Solar Electric", 2985.0, "Ka-Band", 124250000.0, 27.0, "Spectrometer", "Radar", 597, false, "Failed", 97.0, "Transfer Orbit"));
            list.add(new SpaceProbeDTO("SP-498", "Mission-498", "Mars", "JAXA", 5480.0, LocalDateTime.of(2013, 7, 23, 10, 30), LocalDateTime.of(2015, 7, 23, 11, 45), "Ion", 2990.0, "X-Band", 124500000.0, 28.0, "Radar", "Magnetometer", 598, true, "Aborted", 98.0, "Elliptical"));
            list.add(new SpaceProbeDTO("SP-499", "Mission-499", "Moon", "SpaceX", 5490.0, LocalDateTime.of(2014, 8, 24, 10, 30), LocalDateTime.of(2016, 8, 24, 11, 45), "Nuclear", 2995.0, "S-Band", 124750000.0, 29.0, "Magnetometer", "Camera", 599, false, "In Progress", 99.0, "Circular"));
            list.add(new SpaceProbeDTO("SP-500", "Mission-500", "Jupiter", "NASA", 5500.0, LocalDateTime.of(2015, 9, 25, 10, 30), LocalDateTime.of(2017, 9, 25, 11, 45), "Chemical", 3000.0, "Ka-Band", 125000000.0, 30.0, "Camera", "Spectrometer", 600, true, "Success", 0.0, "Transfer Orbit"));


            Iterator<SpaceProbeDTO> iterator = list.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                SpaceProbeDTO dto = iterator.next();
                if ("Success".equals(dto.getStatus())) {
                    count++;
                }
            }
            System.out.println("Number of successful space probes: " + count);



            Iterator<SpaceProbeDTO> iterator1 = list.iterator();
            int count1 = 0;
            while (iterator1.hasNext()) {
                    SpaceProbeDTO dto = iterator1.next();
                    if ("Solar Electric".equals(dto.getPropulsionType())) {
                            count1++;
                    }
            }
            System.out.println("Solar Electric Count : " + count1);

            Iterator<SpaceProbeDTO> iterator2 = list.iterator();
            int count2 = 0;

            while (iterator2.hasNext()) {
                    SpaceProbeDTO dto = iterator2.next();
                    if (dto.isActive()) {
                            count2++;
                    }
            }
            System.out.println("Active Probes : " + count2);


            Iterator<SpaceProbeDTO> iterator3 = list.iterator();
            int count3 = 0;
            while (iterator3.hasNext()) {
                    SpaceProbeDTO dto = iterator3.next();
                    if ("Mars".equals(dto.getTargetCelestialBody())) {
                            count3++;
                    }
            }
            System.out.println("Mars Probes : " + count3);


            Iterator<SpaceProbeDTO> iterator4 = list.iterator();
            int count4 = 0;
            while (iterator4.hasNext()) {
                    SpaceProbeDTO dto = iterator4.next();

                    if (dto.getFuelRemaining() < 50) {
                            count4++;
                    }
            }
            System.out.println("Fuel < 50 : " + count4);



            Iterator<SpaceProbeDTO> iterator5 = list.iterator();
            int count5 = 0;
            while (iterator5.hasNext()) {
                    SpaceProbeDTO dto = iterator5.next();
                    if ("NASA".equals(dto.getManufacturer())) {
                            count5++;
                    }
            }
            System.out.println("NASA Probes : " + count5);


            Iterator<SpaceProbeDTO> iterator6= list.iterator();
            int count6 = 0;
            while (iterator6.hasNext()) {
                    SpaceProbeDTO dto = iterator6.next();
                    if (dto.getMissionDurationDays() > 365) {
                            count6++;
                    }
            }
            System.out.println("Mission > 365 Days : " + count6);


            Iterator<SpaceProbeDTO> iterator7 = list.iterator();
            int count7 = 0;
            while (iterator7.hasNext()) {
                    SpaceProbeDTO dto = iterator7.next();
                    if (dto.getPowerOutput() > 1000) {
                            count7++;
                    }
            }
            System.out.println("Power > 1000 : " + count7);



            Iterator<SpaceProbeDTO> iterator8 = list.iterator();
            int count8 = 0;
            while (iterator8.hasNext()) {
                    SpaceProbeDTO dto = iterator8.next();
                    if (dto.getDistanceFromEarth() <= 1000000) {
                            count8++;
                    }
            }
            System.out.println("Within 1 Million KM : " + count8);




            Iterator<SpaceProbeDTO> iterator9 = list.iterator();
            int count9 = 0;
            while (iterator9.hasNext()) {
                    SpaceProbeDTO dto = iterator9.next();
                    if ("Camera".equals(dto.getPrimaryInstrument())) {
                            count9++;
                    }
            }
            System.out.println("Camera Instrument : " + count9);


            Iterator<SpaceProbeDTO> iterator10 = list.iterator();
                    int count10 = 0;
                    while (iterator10.hasNext()) {
                            SpaceProbeDTO dto = iterator10.next();
                            if ("Failed".equals(dto.getStatus())) {
                                    count10++;
                            }
                    }
                    System.out.println("Failed Probes : " + count10);

            Iterator<SpaceProbeDTO> iterator11 = list.iterator();
                    int count11 = 0;
                    while (iterator11.hasNext()) {
                            SpaceProbeDTO dto = iterator11.next();
                            if (dto.getLaunchDate().isAfter(LocalDateTime.of(2020, 1, 1, 0, 0))) {
                                    count11++;
                            }
                    }

                    System.out.println("Launched After 2020 : " + count11);


            Iterator<SpaceProbeDTO> iterator12 = list.iterator();
            int count12 = 0;

            while (iterator12.hasNext()) {
                    SpaceProbeDTO dto = iterator12.next();

                    if (dto.getOrbitalVelocity() > 30) {
                            count++;
                    }
            }

            System.out.println("Orbital Velocity > 30 : " + count12);


            Iterator<SpaceProbeDTO> iterator13 = list.iterator();
            int count13= 0;
            while (iterator13.hasNext()) {
                    SpaceProbeDTO dto = iterator13.next();
                    if (dto.getLaunchMass() > 1000) {
                            count13++;
                    }
            }

            System.out.println("Launch Mass > 1000 : " + count13);



            Iterator<SpaceProbeDTO> iterator14 = list.iterator();
            int count14 = 0;
            while (iterator14.hasNext()) {
                    SpaceProbeDTO dto = iterator14.next();
                    if ("X-Band".equals(dto.getCommunicationFrequency())) {
                            count14++;
                    }
            }
            System.out.println("X-Band Probes : " + count14);

            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if ("Failed".equals(dto.getStatus())) {
                            iterator.remove();
                    }
            }
            System.out.println("Failed Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if (dto.getFuelRemaining() < 10) {
                            iterator.remove();
                    }
            }
            System.out.println("Fuel Less Than 10 Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if ("Moon".equals(dto.getTargetCelestialBody())) {
                            iterator.remove();
                    }
            }
            System.out.println("Moon Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if (dto.getMissionDurationDays() < 100) {
                            iterator.remove();
                    }
            }
            System.out.println("Mission Duration Less Than 100 Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if ("Chemical".equals(dto.getPropulsionType())) {
                            iterator.remove();
                    }
            }
            System.out.println("Chemical Propulsion Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if (dto.getDistanceFromEarth() > 10000000) {
                            iterator.remove();
                    }
            }
            System.out.println("Distance Greater Than 10 Million KM Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if (dto.getPowerOutput() < 500) {
                            iterator.remove();
                    }
            }
            System.out.println("Power Output Less Than 500 Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if ("Aborted".equals(dto.getStatus())) {
                            iterator.remove();
                    }
            }

            System.out.println("Aborted Probes are Removed");


            while (iterator.hasNext()) {
                    SpaceProbeDTO dto = iterator.next();
                    if (dto.getSecondaryInstrument() == null ||
                            dto.getSecondaryInstrument().isEmpty()) {
                            iterator.remove();
                    }
            }
            System.out.println("Probes with Null or Empty Secondary Instrument are Removed");


            Iterator<SpaceProbeDTO> iterator15 = list.iterator();
            int count15 = 0;
            while (iterator15.hasNext()) {
                    SpaceProbeDTO dto = iterator15.next();
                    if ("Success".equals(dto.getStatus()) && dto.isActive()) {
                            count15++;
                    }
            }

            System.out.println("Success and Active Probes : " + count15);



            Iterator<SpaceProbeDTO> iterator16= list.iterator();
            while (iterator16.hasNext()) {
                    SpaceProbeDTO dto = iterator16.next();

                    if (dto.getFuelRemaining() < 20 && "Failed".equals(dto.getStatus())) {
                            iterator16.remove();
                    }
            }

            System.out.println("Failed Probes with Fuel < 20 are Removed");



            Iterator<SpaceProbeDTO> iterator17 = list.iterator();
            int count17 = 0;
            while (iterator17.hasNext()) {
                    SpaceProbeDTO dto = iterator17.next();
                    if ("Mars".equals(dto.getTargetCelestialBody()) && "ESA".equals(dto.getManufacturer())) {
                            count17++;
                    }
            }
            System.out.println("Mars and ESA Probes : " + count17);


            Iterator<SpaceProbeDTO> iterator18= list.iterator();
            while (iterator18.hasNext()) {
                    SpaceProbeDTO dto = iterator18.next();
                    if (dto.getLaunchMass() > 2000 && dto.getPowerOutput() < 1000) {
                            iterator18.remove();
                    }
            }
            System.out.println("Launch Mass > 2000 and Power < 1000 Probes are Removed");


            Iterator<SpaceProbeDTO> iterator19 = list.iterator();
            int count19 = 0;

            while (iterator19.hasNext()) {
                    SpaceProbeDTO dto = iterator19.next();
                    if (dto.getMissionDurationDays() > 500 && dto.isActive()) {
                            count19++;
                    }
            }
            System.out.println("Mission Duration > 500 and Active Probes : " + count19);


            Iterator<SpaceProbeDTO> iterator20 = list.iterator();
            while (iterator20.hasNext()) {
                    SpaceProbeDTO dto = iterator20.next();
                    if ("Solar Electric".equals(dto.getPropulsionType()) && dto.getDistanceFromEarth() > 5000000) {
                            iterator20.remove();
                    }
            }
            System.out.println("Solar Electric Probes Beyond 5 Million KM are Removed");

            Iterator<SpaceProbeDTO> iterator21 = list.iterator();
            int count21= 0;
            while (iterator21.hasNext()) {
                    SpaceProbeDTO dto = iterator21.next();
                    if ("Spectrometer".equals(dto.getPrimaryInstrument()) && "Camera".equals(dto.getSecondaryInstrument())) {
                            count21++;
                    }
            }
            System.out.println("Spectrometer and Camera Probes : " + count21);


            Iterator<SpaceProbeDTO> iterator22 = list.iterator();
            int count22 = 0;
            while (iterator22.hasNext()) {
                    SpaceProbeDTO dto = iterator22.next();
                    if (("Camera".equals(dto.getPrimaryInstrument()) || "Camera".equals(dto.getSecondaryInstrument())) && "Success".equals(dto.getStatus())) {
                            count22++;
                    }
            }
            System.out.println("Probes with Camera Instrument and Success Status : " + count22);

            Iterator<SpaceProbeDTO> iterator23 = list.iterator();
            int count23= 0;
            while (iterator23.hasNext()) {
                    SpaceProbeDTO dto = iterator23.next();

                    if ("Success".equals(dto.getStatus()) && dto.getFuelRemaining() > 30 && dto.getPowerOutput() > 800) {
                            count23++;
                    }
            }

            System.out.println("Success Probes with Fuel > 30 and Power > 800 : " + count23);



            Iterator<SpaceProbeDTO> iterator24 = list.iterator();
            boolean found = false;
            while (iterator24.hasNext()) {
                    SpaceProbeDTO dto = iterator24.next();
                    if ("In Progress".equals(dto.getStatus())) {
                            found = true;
                            break;
                    }
            }

            System.out.println("Any In Progress Probe : " + found);



            Iterator<SpaceProbeDTO> iterator25 = list.iterator();

            boolean found1 = false;

            while (iterator25.hasNext()) {
                    SpaceProbeDTO dto = iterator25.next();
                    if ("Jupiter".equals(dto.getTargetCelestialBody())) {
                            found1 = true;
                            break;
                    }
            }
            System.out.println("Jupiter Probe Exists : " + found1);


            Iterator<SpaceProbeDTO> iterator26 = list.iterator();
            boolean allFuel = true;
            while (iterator26.hasNext()) {
                    SpaceProbeDTO dto = iterator26.next();
                    if (dto.getFuelRemaining() <= 0) {
                            allFuel = false;
                            break;
                    }
            }

            System.out.println("All Fuel > 0 : " + allFuel);


            Iterator<SpaceProbeDTO> iterator27 = list.iterator();

            boolean found2 = false;

            while (iterator27.hasNext()) {
                    SpaceProbeDTO dto = iterator27.next();
                    if (dto.getPowerOutput() > 5000) {
                            found2 = true;
                            break;
                    }
            }
            System.out.println("Power > 5000 Exists : " + found2);


            Iterator<SpaceProbeDTO> iterator28 = list.iterator();
            boolean valid = true;

            while (iterator28.hasNext()) {
                    SpaceProbeDTO dto = iterator28.next();
                    if (dto.isActive()) {
                            if (dto.getCommunicationFrequency() == null || dto.getCommunicationFrequency().isEmpty()) {
                                    valid = false;
                                    break;
                            }
                    }
            }
            System.out.println("All Active Probes Have Communication Frequency : " + valid);


            Iterator<SpaceProbeDTO> iterator29 = list.iterator();
            boolean found3 = false;
            while (iterator29.hasNext()) {

                    SpaceProbeDTO dto = iterator29.next();
                    if (dto.getMissionDurationDays() > 1000) {
                            found3 = true;
                            break;
                    }
            }

            System.out.println("Mission Duration > 1000 Exists : " + found3);


            Iterator<SpaceProbeDTO> iterator30 = list.iterator();
            boolean found4= false;
            while (iterator30.hasNext()) {

                    SpaceProbeDTO dto = iterator30.next();
                    if ("Elliptical".equals(dto.getTrajectoryPath())) {
                            found4 = true;
                            break;
                    }
            }
            System.out.println("Elliptical Path Exists : " + found4);



            Iterator<SpaceProbeDTO> iterator31= list.iterator();

            boolean valid1 = true;

            while (iterator31.hasNext()) {
                    SpaceProbeDTO dto = iterator31.next();
                    if ("Success".equals(dto.getStatus()) && dto.getArrivalDate() == null) {
                            valid1= false;
                            break;
                    }
            }

            System.out.println("Success Probes Have Arrival Date : " + valid1);


            Iterator<SpaceProbeDTO> iterator32 = list.iterator();
            while (iterator32.hasNext()) {
                    SpaceProbeDTO dto = iterator32.next();
                    long days = ChronoUnit.DAYS.between(dto.getLaunchDate(), LocalDateTime.now());
                    if (days > dto.getMissionDurationDays()) {
                            iterator32.remove();
                    }
            }

            System.out.println("Exceeded Mission Duration Probes Removed");
        }
    }


