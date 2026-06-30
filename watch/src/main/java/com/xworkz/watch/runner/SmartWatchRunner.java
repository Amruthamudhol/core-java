package com.xworkz.watch.runner;

import com.xworkz.watch.dto.SmartWatchDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SmartWatchRunner {
    public static void main(String[] args) {
        List<SmartWatchDTO> smartWatchList = new ArrayList<>();

        smartWatchList.add(new SmartWatchDTO(1, "Apple", "Model-1", 1.2, 250, false, false, 3099.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(2, "Samsung", "Model-2", 1.3, 251, true, false, 3199.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(3, "Noise", "Model-3", 1.4, 252, false, true, 3299.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(4, "boAt", "Model-4", 1.5, 253, true, false, 3399.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(5, "Fire-Boltt", "Model-5", 1.6, 254, false, false, 3499.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(6, "Amazfit", "Model-6", 1.2, 255, true, true, 3599.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(7, "Fastrack", "Model-7", 1.3, 256, false, false, 3699.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(8, "Realme", "Model-8", 1.4, 257, true, false, 3799.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(9, "OnePlus", "Model-9", 1.5, 258, false, true, 3899.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(10, "Fitbit", "Model-10", 1.6, 259, true, false, 3999.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(11, "Apple", "Model-11", 1.2, 260, false, false, 4099.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(12, "Samsung", "Model-12", 1.3, 261, true, true, 4199.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(13, "Noise", "Model-13", 1.4, 262, false, false, 4299.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(14, "boAt", "Model-14", 1.5, 263, true, false, 4399.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(15, "Fire-Boltt", "Model-15", 1.6, 264, false, true, 4499.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(16, "Amazfit", "Model-16", 1.2, 265, true, false, 4599.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(17, "Fastrack", "Model-17", 1.3, 266, false, false, 4699.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(18, "Realme", "Model-18", 1.4, 267, true, true, 4799.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(19, "OnePlus", "Model-19", 1.5, 268, false, false, 4899.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(20, "Fitbit", "Model-20", 1.6, 269, true, false, 4999.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(21, "Apple", "Model-21", 1.2, 270, false, true, 5099.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(22, "Samsung", "Model-22", 1.3, 271, true, false, 5199.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(23, "Noise", "Model-23", 1.4, 272, false, false, 5299.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(24, "boAt", "Model-24", 1.5, 273, true, true, 5399.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(25, "Fire-Boltt", "Model-25", 1.6, 274, false, false, 5499.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(26, "Amazfit", "Model-26", 1.2, 275, true, false, 5599.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(27, "Fastrack", "Model-27", 1.3, 276, false, true, 5699.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(28, "Realme", "Model-28", 1.4, 277, true, false, 5799.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(29, "OnePlus", "Model-29", 1.5, 278, false, false, 5899.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(30, "Fitbit", "Model-30", 1.6, 279, true, true, 5999.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(31, "Apple", "Model-31", 1.2, 280, false, false, 6099.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(32, "Samsung", "Model-32", 1.3, 281, true, false, 6199.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(33, "Noise", "Model-33", 1.4, 282, false, true, 6299.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(34, "boAt", "Model-34", 1.5, 283, true, false, 6399.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(35, "Fire-Boltt", "Model-35", 1.6, 284, false, false, 6499.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(36, "Amazfit", "Model-36", 1.2, 285, true, true, 6599.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(37, "Fastrack", "Model-37", 1.3, 286, false, false, 6699.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(38, "Realme", "Model-38", 1.4, 287, true, false, 6799.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(39, "OnePlus", "Model-39", 1.5, 288, false, true, 6899.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(40, "Fitbit", "Model-40", 1.6, 289, true, false, 6999.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(41, "Apple", "Model-41", 1.2, 290, false, false, 7099.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(42, "Samsung", "Model-42", 1.3, 291, true, true, 7199.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(43, "Noise", "Model-43", 1.4, 292, false, false, 7299.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(44, "boAt", "Model-44", 1.5, 293, true, false, 7399.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(45, "Fire-Boltt", "Model-45", 1.6, 294, false, true, 7499.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(46, "Amazfit", "Model-46", 1.2, 295, true, false, 7599.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(47, "Fastrack", "Model-47", 1.3, 296, false, false, 7699.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(48, "Realme", "Model-48", 1.4, 297, true, true, 7799.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(49, "OnePlus", "Model-49", 1.5, 298, false, false, 7899.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(50, "Fitbit", "Model-50", 1.6, 299, true, false, 7999.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(51, "Apple", "Model-51", 1.2, 300, false, true, 8099.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(52, "Samsung", "Model-52", 1.3, 301, true, false, 8199.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(53, "Noise", "Model-53", 1.4, 302, false, false, 8299.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(54, "boAt", "Model-54", 1.5, 303, true, true, 8399.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(55, "Fire-Boltt", "Model-55", 1.6, 304, false, false, 8499.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(56, "Amazfit", "Model-56", 1.2, 305, true, false, 8599.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(57, "Fastrack", "Model-57", 1.3, 306, false, true, 8699.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(58, "Realme", "Model-58", 1.4, 307, true, false, 8799.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(59, "OnePlus", "Model-59", 1.5, 308, false, false, 8899.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(60, "Fitbit", "Model-60", 1.6, 309, true, true, 8999.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(61, "Apple", "Model-61", 1.2, 310, false, false, 9099.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(62, "Samsung", "Model-62", 1.3, 311, true, false, 9199.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(63, "Noise", "Model-63", 1.4, 312, false, true, 9299.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(64, "boAt", "Model-64", 1.5, 313, true, false, 9399.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(65, "Fire-Boltt", "Model-65", 1.6, 314, false, false, 9499.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(66, "Amazfit", "Model-66", 1.2, 315, true, true, 9599.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(67, "Fastrack", "Model-67", 1.3, 316, false, false, 9699.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(68, "Realme", "Model-68", 1.4, 317, true, false, 9799.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(69, "OnePlus", "Model-69", 1.5, 318, false, true, 9899.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(70, "Fitbit", "Model-70", 1.6, 319, true, false, 9999.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(71, "Apple", "Model-71", 1.2, 320, false, false, 10099.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(72, "Samsung", "Model-72", 1.3, 321, true, true, 10199.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(73, "Noise", "Model-73", 1.4, 322, false, false, 10299.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(74, "boAt", "Model-74", 1.5, 323, true, false, 10399.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(75, "Fire-Boltt", "Model-75", 1.6, 324, false, true, 10499.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(76, "Amazfit", "Model-76", 1.2, 325, true, false, 10599.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(77, "Fastrack", "Model-77", 1.3, 326, false, false, 10699.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(78, "Realme", "Model-78", 1.4, 327, true, true, 10799.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(79, "OnePlus", "Model-79", 1.5, 328, false, false, 10899.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(80, "Fitbit", "Model-80", 1.6, 329, true, false, 10999.0, LocalDate.of(2024, 8, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(81, "Apple", "Model-81", 1.2, 330, false, true, 11099.0, LocalDate.of(2025, 9, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(82, "Samsung", "Model-82", 1.3, 331, true, false, 11199.0, LocalDate.of(2023, 10, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(83, "Noise", "Model-83", 1.4, 332, false, false, 11299.0, LocalDate.of(2024, 11, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(84, "boAt", "Model-84", 1.5, 333, true, true, 11399.0, LocalDate.of(2025, 12, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(85, "Fire-Boltt", "Model-85", 1.6, 334, false, false, 11499.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(86, "Amazfit", "Model-86", 1.2, 335, true, false, 11599.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(87, "Fastrack", "Model-87", 1.3, 336, false, true, 11699.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(88, "Realme", "Model-88", 1.4, 337, true, false, 11799.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(89, "OnePlus", "Model-89", 1.5, 338, false, false, 11899.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(90, "Fitbit", "Model-90", 1.6, 339, true, true, 11999.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(91, "Apple", "Model-91", 1.2, 340, false, false, 12099.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(92, "Samsung", "Model-92", 1.3, 341, true, false, 12199.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(93, "Noise", "Model-93", 1.4, 342, false, true, 12299.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(94, "boAt", "Model-94", 1.5, 343, true, false, 12399.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(95, "Fire-Boltt", "Model-95", 1.6, 344, false, false, 12499.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(96, "Amazfit", "Model-96", 1.2, 345, true, true, 12599.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(97, "Fastrack", "Model-97", 1.3, 346, false, false, 12699.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(98, "Realme", "Model-98", 1.4, 347, true, false, 12799.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(99, "OnePlus", "Model-99", 1.5, 348, false, true, 12899.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(100, "Fitbit", "Model-100", 1.6, 349, true, false, 12999.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(101, "Apple", "Model-101", 1.2, 350, false, false, 13099.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(102, "Samsung", "Model-102", 1.3, 351, true, true, 13199.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(103, "Noise", "Model-103", 1.4, 352, false, false, 13299.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(104, "boAt", "Model-104", 1.5, 353, true, false, 13399.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(105, "Fire-Boltt", "Model-105", 1.6, 354, false, true, 13499.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(106, "Amazfit", "Model-106", 1.2, 355, true, false, 13599.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(107, "Fastrack", "Model-107", 1.3, 356, false, false, 13699.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(108, "Realme", "Model-108", 1.4, 357, true, true, 13799.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(109, "OnePlus", "Model-109", 1.5, 358, false, false, 13899.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(110, "Fitbit", "Model-110", 1.6, 359, true, false, 13999.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(111, "Apple", "Model-111", 1.2, 360, false, true, 14099.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(112, "Samsung", "Model-112", 1.3, 361, true, false, 14199.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(113, "Noise", "Model-113", 1.4, 362, false, false, 14299.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(114, "boAt", "Model-114", 1.5, 363, true, true, 14399.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(115, "Fire-Boltt", "Model-115", 1.6, 364, false, false, 14499.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(116, "Amazfit", "Model-116", 1.2, 365, true, false, 14599.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(117, "Fastrack", "Model-117", 1.3, 366, false, true, 14699.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(118, "Realme", "Model-118", 1.4, 367, true, false, 14799.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(119, "OnePlus", "Model-119", 1.5, 368, false, false, 14899.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(120, "Fitbit", "Model-120", 1.6, 369, true, true, 14999.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(121, "Apple", "Model-121", 1.2, 370, false, false, 15099.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(122, "Samsung", "Model-122", 1.3, 371, true, false, 15199.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(123, "Noise", "Model-123", 1.4, 372, false, true, 15299.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(124, "boAt", "Model-124", 1.5, 373, true, false, 15399.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(125, "Fire-Boltt", "Model-125", 1.6, 374, false, false, 15499.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(126, "Amazfit", "Model-126", 1.2, 375, true, true, 15599.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(127, "Fastrack", "Model-127", 1.3, 376, false, false, 15699.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(128, "Realme", "Model-128", 1.4, 377, true, false, 15799.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(129, "OnePlus", "Model-129", 1.5, 378, false, true, 15899.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(130, "Fitbit", "Model-130", 1.6, 379, true, false, 15999.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(131, "Apple", "Model-131", 1.2, 380, false, false, 16099.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(132, "Samsung", "Model-132", 1.3, 381, true, true, 16199.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(133, "Noise", "Model-133", 1.4, 382, false, false, 16299.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(134, "boAt", "Model-134", 1.5, 383, true, false, 16399.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(135, "Fire-Boltt", "Model-135", 1.6, 384, false, true, 16499.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(136, "Amazfit", "Model-136", 1.2, 385, true, false, 16599.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(137, "Fastrack", "Model-137", 1.3, 386, false, false, 16699.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(138, "Realme", "Model-138", 1.4, 387, true, true, 16799.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(139, "OnePlus", "Model-139", 1.5, 388, false, false, 16899.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(140, "Fitbit", "Model-140", 1.6, 389, true, false, 16999.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(141, "Apple", "Model-141", 1.2, 390, false, true, 17099.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(142, "Samsung", "Model-142", 1.3, 391, true, false, 17199.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(143, "Noise", "Model-143", 1.4, 392, false, false, 17299.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(144, "boAt", "Model-144", 1.5, 393, true, true, 17399.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(145, "Fire-Boltt", "Model-145", 1.6, 394, false, false, 17499.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(146, "Amazfit", "Model-146", 1.2, 395, true, false, 17599.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(147, "Fastrack", "Model-147", 1.3, 396, false, true, 17699.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(148, "Realme", "Model-148", 1.4, 397, true, false, 17799.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(149, "OnePlus", "Model-149", 1.5, 398, false, false, 17899.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(150, "Fitbit", "Model-150", 1.6, 399, true, true, 17999.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(151, "Apple", "Model-151", 1.2, 400, false, false, 18099.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(152, "Samsung", "Model-152", 1.3, 401, true, false, 18199.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(153, "Noise", "Model-153", 1.4, 402, false, true, 18299.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(154, "boAt", "Model-154", 1.5, 403, true, false, 18399.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(155, "Fire-Boltt", "Model-155", 1.6, 404, false, false, 18499.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(156, "Amazfit", "Model-156", 1.2, 405, true, true, 18599.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(157, "Fastrack", "Model-157", 1.3, 406, false, false, 18699.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(158, "Realme", "Model-158", 1.4, 407, true, false, 18799.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(159, "OnePlus", "Model-159", 1.5, 408, false, true, 18899.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(160, "Fitbit", "Model-160", 1.6, 409, true, false, 18999.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(161, "Apple", "Model-161", 1.2, 410, false, false, 19099.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(162, "Samsung", "Model-162", 1.3, 411, true, true, 19199.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(163, "Noise", "Model-163", 1.4, 412, false, false, 19299.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(164, "boAt", "Model-164", 1.5, 413, true, false, 19399.0, LocalDate.of(2024, 8, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(165, "Fire-Boltt", "Model-165", 1.6, 414, false, true, 19499.0, LocalDate.of(2025, 9, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(166, "Amazfit", "Model-166", 1.2, 415, true, false, 19599.0, LocalDate.of(2023, 10, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(167, "Fastrack", "Model-167", 1.3, 416, false, false, 19699.0, LocalDate.of(2024, 11, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(168, "Realme", "Model-168", 1.4, 417, true, true, 19799.0, LocalDate.of(2025, 12, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(169, "OnePlus", "Model-169", 1.5, 418, false, false, 19899.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(170, "Fitbit", "Model-170", 1.6, 419, true, false, 19999.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(171, "Apple", "Model-171", 1.2, 420, false, true, 20099.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(172, "Samsung", "Model-172", 1.3, 421, true, false, 20199.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(173, "Noise", "Model-173", 1.4, 422, false, false, 20299.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(174, "boAt", "Model-174", 1.5, 423, true, true, 20399.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(175, "Fire-Boltt", "Model-175", 1.6, 424, false, false, 20499.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(176, "Amazfit", "Model-176", 1.2, 425, true, false, 20599.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(177, "Fastrack", "Model-177", 1.3, 426, false, true, 20699.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(178, "Realme", "Model-178", 1.4, 427, true, false, 20799.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(179, "OnePlus", "Model-179", 1.5, 428, false, false, 20899.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(180, "Fitbit", "Model-180", 1.6, 429, true, true, 20999.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(181, "Apple", "Model-181", 1.2, 430, false, false, 21099.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(182, "Samsung", "Model-182", 1.3, 431, true, false, 21199.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(183, "Noise", "Model-183", 1.4, 432, false, true, 21299.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(184, "boAt", "Model-184", 1.5, 433, true, false, 21399.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(185, "Fire-Boltt", "Model-185", 1.6, 434, false, false, 21499.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(186, "Amazfit", "Model-186", 1.2, 435, true, true, 21599.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(187, "Fastrack", "Model-187", 1.3, 436, false, false, 21699.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(188, "Realme", "Model-188", 1.4, 437, true, false, 21799.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(189, "OnePlus", "Model-189", 1.5, 438, false, true, 21899.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(190, "Fitbit", "Model-190", 1.6, 439, true, false, 21999.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(191, "Apple", "Model-191", 1.2, 440, false, false, 22099.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(192, "Samsung", "Model-192", 1.3, 441, true, true, 22199.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(193, "Noise", "Model-193", 1.4, 442, false, false, 22299.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(194, "boAt", "Model-194", 1.5, 443, true, false, 22399.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(195, "Fire-Boltt", "Model-195", 1.6, 444, false, true, 22499.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(196, "Amazfit", "Model-196", 1.2, 445, true, false, 22599.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(197, "Fastrack", "Model-197", 1.3, 446, false, false, 22699.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(198, "Realme", "Model-198", 1.4, 447, true, true, 22799.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(199, "OnePlus", "Model-199", 1.5, 448, false, false, 22899.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(200, "Fitbit", "Model-200", 1.6, 449, true, false, 22999.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(201, "Apple", "Model-201", 1.2, 250, false, true, 23099.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(202, "Samsung", "Model-202", 1.3, 251, true, false, 23199.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(203, "Noise", "Model-203", 1.4, 252, false, false, 23299.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(204, "boAt", "Model-204", 1.5, 253, true, true, 23399.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(205, "Fire-Boltt", "Model-205", 1.6, 254, false, false, 23499.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(206, "Amazfit", "Model-206", 1.2, 255, true, false, 23599.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(207, "Fastrack", "Model-207", 1.3, 256, false, true, 23699.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(208, "Realme", "Model-208", 1.4, 257, true, false, 23799.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(209, "OnePlus", "Model-209", 1.5, 258, false, false, 23899.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(210, "Fitbit", "Model-210", 1.6, 259, true, true, 23999.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(211, "Apple", "Model-211", 1.2, 260, false, false, 24099.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(212, "Samsung", "Model-212", 1.3, 261, true, false, 24199.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(213, "Noise", "Model-213", 1.4, 262, false, true, 24299.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(214, "boAt", "Model-214", 1.5, 263, true, false, 24399.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(215, "Fire-Boltt", "Model-215", 1.6, 264, false, false, 24499.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(216, "Amazfit", "Model-216", 1.2, 265, true, true, 24599.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(217, "Fastrack", "Model-217", 1.3, 266, false, false, 24699.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(218, "Realme", "Model-218", 1.4, 267, true, false, 24799.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(219, "OnePlus", "Model-219", 1.5, 268, false, true, 24899.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(220, "Fitbit", "Model-220", 1.6, 269, true, false, 24999.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(221, "Apple", "Model-221", 1.2, 270, false, false, 25099.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(222, "Samsung", "Model-222", 1.3, 271, true, true, 25199.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(223, "Noise", "Model-223", 1.4, 272, false, false, 25299.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(224, "boAt", "Model-224", 1.5, 273, true, false, 25399.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(225, "Fire-Boltt", "Model-225", 1.6, 274, false, true, 25499.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(226, "Amazfit", "Model-226", 1.2, 275, true, false, 25599.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(227, "Fastrack", "Model-227", 1.3, 276, false, false, 25699.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(228, "Realme", "Model-228", 1.4, 277, true, true, 25799.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(229, "OnePlus", "Model-229", 1.5, 278, false, false, 25899.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(230, "Fitbit", "Model-230", 1.6, 279, true, false, 25999.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(231, "Apple", "Model-231", 1.2, 280, false, true, 26099.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(232, "Samsung", "Model-232", 1.3, 281, true, false, 26199.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(233, "Noise", "Model-233", 1.4, 282, false, false, 26299.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(234, "boAt", "Model-234", 1.5, 283, true, true, 26399.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(235, "Fire-Boltt", "Model-235", 1.6, 284, false, false, 26499.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(236, "Amazfit", "Model-236", 1.2, 285, true, false, 26599.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(237, "Fastrack", "Model-237", 1.3, 286, false, true, 26699.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(238, "Realme", "Model-238", 1.4, 287, true, false, 26799.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(239, "OnePlus", "Model-239", 1.5, 288, false, false, 26899.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(240, "Fitbit", "Model-240", 1.6, 289, true, true, 26999.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(241, "Apple", "Model-241", 1.2, 290, false, false, 27099.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(242, "Samsung", "Model-242", 1.3, 291, true, false, 27199.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(243, "Noise", "Model-243", 1.4, 292, false, true, 27299.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(244, "boAt", "Model-244", 1.5, 293, true, false, 27399.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(245, "Fire-Boltt", "Model-245", 1.6, 294, false, false, 27499.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(246, "Amazfit", "Model-246", 1.2, 295, true, true, 27599.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(247, "Fastrack", "Model-247", 1.3, 296, false, false, 27699.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(248, "Realme", "Model-248", 1.4, 297, true, false, 27799.0, LocalDate.of(2024, 8, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(249, "OnePlus", "Model-249", 1.5, 298, false, true, 27899.0, LocalDate.of(2025, 9, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(250, "Fitbit", "Model-250", 1.6, 299, true, false, 27999.0, LocalDate.of(2023, 10, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(251, "Apple", "Model-251", 1.2, 300, false, false, 28099.0, LocalDate.of(2024, 11, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(252, "Samsung", "Model-252", 1.3, 301, true, true, 28199.0, LocalDate.of(2025, 12, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(253, "Noise", "Model-253", 1.4, 302, false, false, 28299.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(254, "boAt", "Model-254", 1.5, 303, true, false, 28399.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(255, "Fire-Boltt", "Model-255", 1.6, 304, false, true, 28499.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(256, "Amazfit", "Model-256", 1.2, 305, true, false, 28599.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(257, "Fastrack", "Model-257", 1.3, 306, false, false, 28699.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(258, "Realme", "Model-258", 1.4, 307, true, true, 28799.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(259, "OnePlus", "Model-259", 1.5, 308, false, false, 28899.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(260, "Fitbit", "Model-260", 1.6, 309, true, false, 28999.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(261, "Apple", "Model-261", 1.2, 310, false, true, 29099.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(262, "Samsung", "Model-262", 1.3, 311, true, false, 29199.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(263, "Noise", "Model-263", 1.4, 312, false, false, 29299.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(264, "boAt", "Model-264", 1.5, 313, true, true, 29399.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(265, "Fire-Boltt", "Model-265", 1.6, 314, false, false, 29499.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(266, "Amazfit", "Model-266", 1.2, 315, true, false, 29599.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(267, "Fastrack", "Model-267", 1.3, 316, false, true, 29699.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(268, "Realme", "Model-268", 1.4, 317, true, false, 29799.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(269, "OnePlus", "Model-269", 1.5, 318, false, false, 29899.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(270, "Fitbit", "Model-270", 1.6, 319, true, true, 29999.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(271, "Apple", "Model-271", 1.2, 320, false, false, 30099.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(272, "Samsung", "Model-272", 1.3, 321, true, false, 30199.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(273, "Noise", "Model-273", 1.4, 322, false, true, 30299.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(274, "boAt", "Model-274", 1.5, 323, true, false, 30399.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(275, "Fire-Boltt", "Model-275", 1.6, 324, false, false, 30499.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(276, "Amazfit", "Model-276", 1.2, 325, true, true, 30599.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(277, "Fastrack", "Model-277", 1.3, 326, false, false, 30699.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(278, "Realme", "Model-278", 1.4, 327, true, false, 30799.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(279, "OnePlus", "Model-279", 1.5, 328, false, true, 30899.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(280, "Fitbit", "Model-280", 1.6, 329, true, false, 30999.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(281, "Apple", "Model-281", 1.2, 330, false, false, 31099.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(282, "Samsung", "Model-282", 1.3, 331, true, true, 31199.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(283, "Noise", "Model-283", 1.4, 332, false, false, 31299.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(284, "boAt", "Model-284", 1.5, 333, true, false, 31399.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(285, "Fire-Boltt", "Model-285", 1.6, 334, false, true, 31499.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(286, "Amazfit", "Model-286", 1.2, 335, true, false, 31599.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(287, "Fastrack", "Model-287", 1.3, 336, false, false, 31699.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(288, "Realme", "Model-288", 1.4, 337, true, true, 31799.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(289, "OnePlus", "Model-289", 1.5, 338, false, false, 31899.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(290, "Fitbit", "Model-290", 1.6, 339, true, false, 31999.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(291, "Apple", "Model-291", 1.2, 340, false, true, 32099.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(292, "Samsung", "Model-292", 1.3, 341, true, false, 32199.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(293, "Noise", "Model-293", 1.4, 342, false, false, 32299.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(294, "boAt", "Model-294", 1.5, 343, true, true, 32399.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(295, "Fire-Boltt", "Model-295", 1.6, 344, false, false, 32499.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(296, "Amazfit", "Model-296", 1.2, 345, true, false, 32599.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(297, "Fastrack", "Model-297", 1.3, 346, false, true, 32699.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(298, "Realme", "Model-298", 1.4, 347, true, false, 32799.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(299, "OnePlus", "Model-299", 1.5, 348, false, false, 32899.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(300, "Fitbit", "Model-300", 1.6, 349, true, true, 32999.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(301, "Apple", "Model-301", 1.2, 350, false, false, 33099.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(302, "Samsung", "Model-302", 1.3, 351, true, false, 33199.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(303, "Noise", "Model-303", 1.4, 352, false, true, 33299.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(304, "boAt", "Model-304", 1.5, 353, true, false, 33399.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(305, "Fire-Boltt", "Model-305", 1.6, 354, false, false, 33499.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(306, "Amazfit", "Model-306", 1.2, 355, true, true, 33599.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(307, "Fastrack", "Model-307", 1.3, 356, false, false, 33699.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(308, "Realme", "Model-308", 1.4, 357, true, false, 33799.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(309, "OnePlus", "Model-309", 1.5, 358, false, true, 33899.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(310, "Fitbit", "Model-310", 1.6, 359, true, false, 33999.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(311, "Apple", "Model-311", 1.2, 360, false, false, 34099.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(312, "Samsung", "Model-312", 1.3, 361, true, true, 34199.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(313, "Noise", "Model-313", 1.4, 362, false, false, 34299.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(314, "boAt", "Model-314", 1.5, 363, true, false, 34399.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(315, "Fire-Boltt", "Model-315", 1.6, 364, false, true, 34499.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(316, "Amazfit", "Model-316", 1.2, 365, true, false, 34599.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(317, "Fastrack", "Model-317", 1.3, 366, false, false, 34699.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(318, "Realme", "Model-318", 1.4, 367, true, true, 34799.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(319, "OnePlus", "Model-319", 1.5, 368, false, false, 34899.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(320, "Fitbit", "Model-320", 1.6, 369, true, false, 34999.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(321, "Apple", "Model-321", 1.2, 370, false, true, 35099.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(322, "Samsung", "Model-322", 1.3, 371, true, false, 35199.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(323, "Noise", "Model-323", 1.4, 372, false, false, 35299.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(324, "boAt", "Model-324", 1.5, 373, true, true, 35399.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(325, "Fire-Boltt", "Model-325", 1.6, 374, false, false, 35499.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(326, "Amazfit", "Model-326", 1.2, 375, true, false, 35599.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(327, "Fastrack", "Model-327", 1.3, 376, false, true, 35699.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(328, "Realme", "Model-328", 1.4, 377, true, false, 35799.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(329, "OnePlus", "Model-329", 1.5, 378, false, false, 35899.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(330, "Fitbit", "Model-330", 1.6, 379, true, true, 35999.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(331, "Apple", "Model-331", 1.2, 380, false, false, 36099.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(332, "Samsung", "Model-332", 1.3, 381, true, false, 36199.0, LocalDate.of(2024, 8, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(333, "Noise", "Model-333", 1.4, 382, false, true, 36299.0, LocalDate.of(2025, 9, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(334, "boAt", "Model-334", 1.5, 383, true, false, 36399.0, LocalDate.of(2023, 10, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(335, "Fire-Boltt", "Model-335", 1.6, 384, false, false, 36499.0, LocalDate.of(2024, 11, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(336, "Amazfit", "Model-336", 1.2, 385, true, true, 36599.0, LocalDate.of(2025, 12, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(337, "Fastrack", "Model-337", 1.3, 386, false, false, 36699.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(338, "Realme", "Model-338", 1.4, 387, true, false, 36799.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(339, "OnePlus", "Model-339", 1.5, 388, false, true, 36899.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(340, "Fitbit", "Model-340", 1.6, 389, true, false, 36999.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(341, "Apple", "Model-341", 1.2, 390, false, false, 37099.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(342, "Samsung", "Model-342", 1.3, 391, true, true, 37199.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(343, "Noise", "Model-343", 1.4, 392, false, false, 37299.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(344, "boAt", "Model-344", 1.5, 393, true, false, 37399.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(345, "Fire-Boltt", "Model-345", 1.6, 394, false, true, 37499.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(346, "Amazfit", "Model-346", 1.2, 395, true, false, 37599.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(347, "Fastrack", "Model-347", 1.3, 396, false, false, 37699.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(348, "Realme", "Model-348", 1.4, 397, true, true, 37799.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(349, "OnePlus", "Model-349", 1.5, 398, false, false, 37899.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(350, "Fitbit", "Model-350", 1.6, 399, true, false, 37999.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(351, "Apple", "Model-351", 1.2, 400, false, true, 38099.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(352, "Samsung", "Model-352", 1.3, 401, true, false, 38199.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(353, "Noise", "Model-353", 1.4, 402, false, false, 38299.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(354, "boAt", "Model-354", 1.5, 403, true, true, 38399.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(355, "Fire-Boltt", "Model-355", 1.6, 404, false, false, 38499.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(356, "Amazfit", "Model-356", 1.2, 405, true, false, 38599.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(357, "Fastrack", "Model-357", 1.3, 406, false, true, 38699.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(358, "Realme", "Model-358", 1.4, 407, true, false, 38799.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(359, "OnePlus", "Model-359", 1.5, 408, false, false, 38899.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(360, "Fitbit", "Model-360", 1.6, 409, true, true, 38999.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(361, "Apple", "Model-361", 1.2, 410, false, false, 39099.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(362, "Samsung", "Model-362", 1.3, 411, true, false, 39199.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(363, "Noise", "Model-363", 1.4, 412, false, true, 39299.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(364, "boAt", "Model-364", 1.5, 413, true, false, 39399.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(365, "Fire-Boltt", "Model-365", 1.6, 414, false, false, 39499.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(366, "Amazfit", "Model-366", 1.2, 415, true, true, 39599.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(367, "Fastrack", "Model-367", 1.3, 416, false, false, 39699.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(368, "Realme", "Model-368", 1.4, 417, true, false, 39799.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(369, "OnePlus", "Model-369", 1.5, 418, false, true, 39899.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(370, "Fitbit", "Model-370", 1.6, 419, true, false, 39999.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(371, "Apple", "Model-371", 1.2, 420, false, false, 40099.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(372, "Samsung", "Model-372", 1.3, 421, true, true, 40199.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(373, "Noise", "Model-373", 1.4, 422, false, false, 40299.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(374, "boAt", "Model-374", 1.5, 423, true, false, 40399.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(375, "Fire-Boltt", "Model-375", 1.6, 424, false, true, 40499.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(376, "Amazfit", "Model-376", 1.2, 425, true, false, 40599.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(377, "Fastrack", "Model-377", 1.3, 426, false, false, 40699.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(378, "Realme", "Model-378", 1.4, 427, true, true, 40799.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(379, "OnePlus", "Model-379", 1.5, 428, false, false, 40899.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(380, "Fitbit", "Model-380", 1.6, 429, true, false, 40999.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(381, "Apple", "Model-381", 1.2, 430, false, true, 41099.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(382, "Samsung", "Model-382", 1.3, 431, true, false, 41199.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(383, "Noise", "Model-383", 1.4, 432, false, false, 41299.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(384, "boAt", "Model-384", 1.5, 433, true, true, 41399.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(385, "Fire-Boltt", "Model-385", 1.6, 434, false, false, 41499.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(386, "Amazfit", "Model-386", 1.2, 435, true, false, 41599.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(387, "Fastrack", "Model-387", 1.3, 436, false, true, 41699.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(388, "Realme", "Model-388", 1.4, 437, true, false, 41799.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(389, "OnePlus", "Model-389", 1.5, 438, false, false, 41899.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(390, "Fitbit", "Model-390", 1.6, 439, true, true, 41999.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(391, "Apple", "Model-391", 1.2, 440, false, false, 42099.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(392, "Samsung", "Model-392", 1.3, 441, true, false, 42199.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(393, "Noise", "Model-393", 1.4, 442, false, true, 42299.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(394, "boAt", "Model-394", 1.5, 443, true, false, 42399.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(395, "Fire-Boltt", "Model-395", 1.6, 444, false, false, 42499.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(396, "Amazfit", "Model-396", 1.2, 445, true, true, 42599.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(397, "Fastrack", "Model-397", 1.3, 446, false, false, 42699.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(398, "Realme", "Model-398", 1.4, 447, true, false, 42799.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(399, "OnePlus", "Model-399", 1.5, 448, false, true, 42899.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(400, "Fitbit", "Model-400", 1.6, 449, true, false, 42999.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(401, "Apple", "Model-401", 1.2, 250, false, false, 43099.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(402, "Samsung", "Model-402", 1.3, 251, true, true, 43199.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(403, "Noise", "Model-403", 1.4, 252, false, false, 43299.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(404, "boAt", "Model-404", 1.5, 253, true, false, 43399.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(405, "Fire-Boltt", "Model-405", 1.6, 254, false, true, 43499.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(406, "Amazfit", "Model-406", 1.2, 255, true, false, 43599.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(407, "Fastrack", "Model-407", 1.3, 256, false, false, 43699.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(408, "Realme", "Model-408", 1.4, 257, true, true, 43799.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(409, "OnePlus", "Model-409", 1.5, 258, false, false, 43899.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(410, "Fitbit", "Model-410", 1.6, 259, true, false, 43999.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(411, "Apple", "Model-411", 1.2, 260, false, true, 44099.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(412, "Samsung", "Model-412", 1.3, 261, true, false, 44199.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(413, "Noise", "Model-413", 1.4, 262, false, false, 44299.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(414, "boAt", "Model-414", 1.5, 263, true, true, 44399.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(415, "Fire-Boltt", "Model-415", 1.6, 264, false, false, 44499.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(416, "Amazfit", "Model-416", 1.2, 265, true, false, 44599.0, LocalDate.of(2024, 8, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(417, "Fastrack", "Model-417", 1.3, 266, false, true, 44699.0, LocalDate.of(2025, 9, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(418, "Realme", "Model-418", 1.4, 267, true, false, 44799.0, LocalDate.of(2023, 10, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(419, "OnePlus", "Model-419", 1.5, 268, false, false, 44899.0, LocalDate.of(2024, 11, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(420, "Fitbit", "Model-420", 1.6, 269, true, true, 44999.0, LocalDate.of(2025, 12, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(421, "Apple", "Model-421", 1.2, 270, false, false, 45099.0, LocalDate.of(2023, 1, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(422, "Samsung", "Model-422", 1.3, 271, true, false, 45199.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(423, "Noise", "Model-423", 1.4, 272, false, true, 45299.0, LocalDate.of(2025, 3, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(424, "boAt", "Model-424", 1.5, 273, true, false, 45399.0, LocalDate.of(2023, 4, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(425, "Fire-Boltt", "Model-425", 1.6, 274, false, false, 45499.0, LocalDate.of(2024, 5, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(426, "Amazfit", "Model-426", 1.2, 275, true, true, 45599.0, LocalDate.of(2025, 6, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(427, "Fastrack", "Model-427", 1.3, 276, false, false, 45699.0, LocalDate.of(2023, 7, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(428, "Realme", "Model-428", 1.4, 277, true, false, 45799.0, LocalDate.of(2024, 8, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(429, "OnePlus", "Model-429", 1.5, 278, false, true, 45899.0, LocalDate.of(2025, 9, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(430, "Fitbit", "Model-430", 1.6, 279, true, false, 45999.0, LocalDate.of(2023, 10, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(431, "Apple", "Model-431", 1.2, 280, false, false, 46099.0, LocalDate.of(2024, 11, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(432, "Samsung", "Model-432", 1.3, 281, true, true, 46199.0, LocalDate.of(2025, 12, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(433, "Noise", "Model-433", 1.4, 282, false, false, 46299.0, LocalDate.of(2023, 1, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(434, "boAt", "Model-434", 1.5, 283, true, false, 46399.0, LocalDate.of(2024, 2, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(435, "Fire-Boltt", "Model-435", 1.6, 284, false, true, 46499.0, LocalDate.of(2025, 3, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(436, "Amazfit", "Model-436", 1.2, 285, true, false, 46599.0, LocalDate.of(2023, 4, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(437, "Fastrack", "Model-437", 1.3, 286, false, false, 46699.0, LocalDate.of(2024, 5, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(438, "Realme", "Model-438", 1.4, 287, true, true, 46799.0, LocalDate.of(2025, 6, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(439, "OnePlus", "Model-439", 1.5, 288, false, false, 46899.0, LocalDate.of(2023, 7, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(440, "Fitbit", "Model-440", 1.6, 289, true, false, 46999.0, LocalDate.of(2024, 8, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(441, "Apple", "Model-441", 1.2, 290, false, true, 47099.0, LocalDate.of(2025, 9, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(442, "Samsung", "Model-442", 1.3, 291, true, false, 47199.0, LocalDate.of(2023, 10, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(443, "Noise", "Model-443", 1.4, 292, false, false, 47299.0, LocalDate.of(2024, 11, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(444, "boAt", "Model-444", 1.5, 293, true, true, 47399.0, LocalDate.of(2025, 12, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(445, "Fire-Boltt", "Model-445", 1.6, 294, false, false, 47499.0, LocalDate.of(2023, 1, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(446, "Amazfit", "Model-446", 1.2, 295, true, false, 47599.0, LocalDate.of(2024, 2, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(447, "Fastrack", "Model-447", 1.3, 296, false, true, 47699.0, LocalDate.of(2025, 3, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(448, "Realme", "Model-448", 1.4, 297, true, false, 47799.0, LocalDate.of(2023, 4, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(449, "OnePlus", "Model-449", 1.5, 298, false, false, 47899.0, LocalDate.of(2024, 5, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(450, "Fitbit", "Model-450", 1.6, 299, true, true, 47999.0, LocalDate.of(2025, 6, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(451, "Apple", "Model-451", 1.2, 300, false, false, 48099.0, LocalDate.of(2023, 7, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(452, "Samsung", "Model-452", 1.3, 301, true, false, 48199.0, LocalDate.of(2024, 8, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(453, "Noise", "Model-453", 1.4, 302, false, true, 48299.0, LocalDate.of(2025, 9, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(454, "boAt", "Model-454", 1.5, 303, true, false, 48399.0, LocalDate.of(2023, 10, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(455, "Fire-Boltt", "Model-455", 1.6, 304, false, false, 48499.0, LocalDate.of(2024, 11, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(456, "Amazfit", "Model-456", 1.2, 305, true, true, 48599.0, LocalDate.of(2025, 12, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(457, "Fastrack", "Model-457", 1.3, 306, false, false, 48699.0, LocalDate.of(2023, 1, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(458, "Realme", "Model-458", 1.4, 307, true, false, 48799.0, LocalDate.of(2024, 2, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(459, "OnePlus", "Model-459", 1.5, 308, false, true, 48899.0, LocalDate.of(2025, 3, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(460, "Fitbit", "Model-460", 1.6, 309, true, false, 48999.0, LocalDate.of(2023, 4, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(461, "Apple", "Model-461", 1.2, 310, false, false, 49099.0, LocalDate.of(2024, 5, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(462, "Samsung", "Model-462", 1.3, 311, true, true, 49199.0, LocalDate.of(2025, 6, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(463, "Noise", "Model-463", 1.4, 312, false, false, 49299.0, LocalDate.of(2023, 7, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(464, "boAt", "Model-464", 1.5, 313, true, false, 49399.0, LocalDate.of(2024, 8, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(465, "Fire-Boltt", "Model-465", 1.6, 314, false, true, 49499.0, LocalDate.of(2025, 9, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(466, "Amazfit", "Model-466", 1.2, 315, true, false, 49599.0, LocalDate.of(2023, 10, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(467, "Fastrack", "Model-467", 1.3, 316, false, false, 49699.0, LocalDate.of(2024, 11, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(468, "Realme", "Model-468", 1.4, 317, true, true, 49799.0, LocalDate.of(2025, 12, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(469, "OnePlus", "Model-469", 1.5, 318, false, false, 49899.0, LocalDate.of(2023, 1, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(470, "Fitbit", "Model-470", 1.6, 319, true, false, 49999.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(471, "Apple", "Model-471", 1.2, 320, false, true, 50099.0, LocalDate.of(2025, 3, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(472, "Samsung", "Model-472", 1.3, 321, true, false, 50199.0, LocalDate.of(2023, 4, 24), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(473, "Noise", "Model-473", 1.4, 322, false, false, 50299.0, LocalDate.of(2024, 5, 25), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(474, "boAt", "Model-474", 1.5, 323, true, true, 50399.0, LocalDate.of(2025, 6, 26), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(475, "Fire-Boltt", "Model-475", 1.6, 324, false, false, 50499.0, LocalDate.of(2023, 7, 27), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(476, "Amazfit", "Model-476", 1.2, 325, true, false, 50599.0, LocalDate.of(2024, 8, 28), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(477, "Fastrack", "Model-477", 1.3, 326, false, true, 50699.0, LocalDate.of(2025, 9, 1), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(478, "Realme", "Model-478", 1.4, 327, true, false, 50799.0, LocalDate.of(2023, 10, 2), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(479, "OnePlus", "Model-479", 1.5, 328, false, false, 50899.0, LocalDate.of(2024, 11, 3), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(480, "Fitbit", "Model-480", 1.6, 329, true, true, 50999.0, LocalDate.of(2025, 12, 4), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(481, "Apple", "Model-481", 1.2, 330, false, false, 51099.0, LocalDate.of(2023, 1, 5), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(482, "Samsung", "Model-482", 1.3, 331, true, false, 51199.0, LocalDate.of(2024, 2, 6), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(483, "Noise", "Model-483", 1.4, 332, false, true, 51299.0, LocalDate.of(2025, 3, 7), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(484, "boAt", "Model-484", 1.5, 333, true, false, 51399.0, LocalDate.of(2023, 4, 8), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(485, "Fire-Boltt", "Model-485", 1.6, 334, false, false, 51499.0, LocalDate.of(2024, 5, 9), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(486, "Amazfit", "Model-486", 1.2, 335, true, true, 51599.0, LocalDate.of(2025, 6, 10), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(487, "Fastrack", "Model-487", 1.3, 336, false, false, 51699.0, LocalDate.of(2023, 7, 11), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(488, "Realme", "Model-488", 1.4, 337, true, false, 51799.0, LocalDate.of(2024, 8, 12), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(489, "OnePlus", "Model-489", 1.5, 338, false, true, 51899.0, LocalDate.of(2025, 9, 13), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(490, "Fitbit", "Model-490", 1.6, 339, true, false, 51999.0, LocalDate.of(2023, 10, 14), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(491, "Apple", "Model-491", 1.2, 340, false, false, 52099.0, LocalDate.of(2024, 11, 15), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(492, "Samsung", "Model-492", 1.3, 341, true, true, 52199.0, LocalDate.of(2025, 12, 16), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(493, "Noise", "Model-493", 1.4, 342, false, false, 52299.0, LocalDate.of(2023, 1, 17), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(494, "boAt", "Model-494", 1.5, 343, true, false, 52399.0, LocalDate.of(2024, 2, 18), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(495, "Fire-Boltt", "Model-495", 1.6, 344, false, true, 52499.0, LocalDate.of(2025, 3, 19), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(496, "Amazfit", "Model-496", 1.2, 345, true, false, 52599.0, LocalDate.of(2023, 4, 20), "HarmonyOS"));
        smartWatchList.add(new SmartWatchDTO(497, "Fastrack", "Model-497", 1.3, 346, false, false, 52699.0, LocalDate.of(2024, 5, 21), "watchOS"));
        smartWatchList.add(new SmartWatchDTO(498, "Realme", "Model-498", 1.4, 347, true, true, 52799.0, LocalDate.of(2025, 6, 22), "Wear OS"));
        smartWatchList.add(new SmartWatchDTO(499, "OnePlus", "Model-499", 1.5, 348, false, false, 52899.0, LocalDate.of(2023, 7, 23), "RTOS"));
        smartWatchList.add(new SmartWatchDTO(50, "Fastrack", "Model-50", 1.6, 299, true, false, 6999.0, LocalDate.of(2024, 2, 22), "Wear OS"));


        //contains

        SmartWatchDTO watch1 = new SmartWatchDTO(1, "Apple", "Model-1", 1.2, 250, false, false, 2099.0, LocalDate.of(2023, 1, 1), "watchOS");
        boolean contains1 = smartWatchList.contains(watch1);
        System.out.println("contains1 : " + contains1);

        SmartWatchDTO watch2 = new SmartWatchDTO(50, "Fastrack", "Model-50", 1.6, 299, true, false, 6999.0, LocalDate.of(2024, 2, 22), "Wear OS");
        boolean contains2 = smartWatchList.contains(watch2);
        System.out.println("contains2 : " + contains2);

        SmartWatchDTO watch3 = new SmartWatchDTO(100, "Fastrack", "Model-100", 1.6, 349, true, false, 11999.0, LocalDate.of(2025, 4, 16), "HarmonyOS");
        boolean contains3 = smartWatchList.contains(watch3);
        System.out.println("contains3 : " + contains3);

        //containsAll
        List<SmartWatchDTO> watchList1 = new ArrayList<>();
        watchList1.add(new SmartWatchDTO(1, "Apple", "Model-1", 1.2, 250, false, false, 2099.0, LocalDate.of(2023, 1, 1), "watchOS"));
        watchList1.add(new SmartWatchDTO(2, "Samsung", "Model-2", 1.3, 251, true, false, 2199.0, LocalDate.of(2024, 2, 2), "Wear OS"));
        boolean containsAll1 = smartWatchList.containsAll(watchList1);
        System.out.println("containsAll1 : " + containsAll1);

        List<SmartWatchDTO> watchList2 = new ArrayList<>();
        watchList2.add(new SmartWatchDTO(499, "OnePlus", "Model-499", 1.5, 348, false, false, 52899.0, LocalDate.of(2023, 7, 23), "RTOS"));
        watchList2.add(new SmartWatchDTO(50, "Fastrack", "Model-50", 1.6, 299, true, false, 6999.0, LocalDate.of(2024, 2, 22), "Wear OS"));
        boolean containsAll2 = smartWatchList.containsAll(watchList2);
        System.out.println("containsAll2 : " + containsAll2);

        List<SmartWatchDTO> watchList3 = new ArrayList<>();
        watchList3.add(new SmartWatchDTO(100, "Fastrack", "Model-100", 1.6, 349, true, false, 11999.0, LocalDate.of(2025, 4, 16), "HarmonyOS"));
        watchList3.add(new SmartWatchDTO(150, "Fastrack", "Model-150", 1.6, 399, true, true, 16999.0, LocalDate.of(2023, 6, 10), "Wear OS"));
        boolean containsAll3 = smartWatchList.containsAll(watchList3);
        System.out.println("containsAll3 : " + containsAll3);

        //listIterator
        ListIterator<SmartWatchDTO> listIterator = smartWatchList.listIterator();

        while (listIterator.hasNext()) {
            SmartWatchDTO watch = listIterator.next();
            System.out.println(watch.getWatchId() + " " + watch.getBrand() + " " + watch.getModelName() + " " + watch.getPrice());
        }
        System.out.println("=====");

        ListIterator<SmartWatchDTO> listIterator2 = smartWatchList.listIterator(smartWatchList.size()-1);
        while (listIterator2.hasPrevious()) {
            SmartWatchDTO watch = listIterator2.previous();
            System.out.println(watch.getWatchId() + " " + watch.getBrand() + " " + watch.getModelName() + " " + watch.getPrice());
        }

        ListIterator<SmartWatchDTO> listIterator3 = smartWatchList.listIterator(250);
        while (listIterator3.hasPrevious()) {
            SmartWatchDTO watch = listIterator3.previous();
            System.out.println(watch);
        }
        System.out.println("-----");

        ListIterator<SmartWatchDTO> listIterator4 = smartWatchList.listIterator(400);
        while (listIterator4.hasNext()) {
            SmartWatchDTO watch = listIterator4.next();
            System.out.println(watch);
        }

        Iterator<SmartWatchDTO> iterator = smartWatchList.iterator();
        while (iterator.hasNext()) {
            SmartWatchDTO watch = iterator.next();
            System.out.println(watch.getWatchId() + " " + watch.getBrand() + " " + watch.getModelName() + " "+ watch.getPrice());
        }
        System.out.println("*********");


        Iterator<SmartWatchDTO> iterator1 = smartWatchList.iterator();
        int count1 = 0;
        while (iterator1.hasNext()) {
            SmartWatchDTO dto = iterator1.next();
            if (dto.getBrand().equals("Apple")) {
                count1++;
            }
        }
        System.out.println("Apple Watches : " + count1);


        Iterator<SmartWatchDTO> iterator2 = smartWatchList.iterator();
        int count2 = 0;
        while (iterator2.hasNext()) {
            SmartWatchDTO dto = iterator2.next();
            if (dto.isGpsEnabled()) {
                count2++;
            }
        }
        System.out.println("GPS Enabled Watches : " + count2);


        Iterator<SmartWatchDTO> iterator4 = smartWatchList.iterator();
        int count4 = 0;
        while (iterator4.hasNext()) {
            SmartWatchDTO dto = iterator4.next();
            if (dto.getPrice() > 20000) {
                count4++;
            }
        }
        System.out.println("Price Greater Than 20000 : " + count4);


        Iterator<SmartWatchDTO> iterator7 = smartWatchList.iterator();
        while (iterator7.hasNext()) {
            SmartWatchDTO dto = iterator7.next();

            if (dto.getLaunchDate().getYear() < 2024) {
                System.out.println("Removing : " + dto);
                iterator7.remove();
            }
        }
        System.out.println("Remaining Smart Watches : " + smartWatchList.size());


        //removeAll
        List<SmartWatchDTO> removeList = new ArrayList<>();
        for (SmartWatchDTO dto : smartWatchList) {
            if ("Apple".equals(dto.getBrand())) {
                removeList.add(dto);
            }

        }

        System.out.println("Before Remove : " + smartWatchList.size());
        smartWatchList.removeAll(removeList);
        System.out.println("After Remove : " + smartWatchList.size());
        System.out.println("-------");


        List<SmartWatchDTO> removeList1 = new ArrayList<>();
        for (SmartWatchDTO dto : smartWatchList) {
            if (dto.getBatteryCapacity() < 300) {
                removeList1.add(dto);
            }
        }
        System.out.println("Before Remove : " + smartWatchList.size());
        smartWatchList.removeAll(removeList1);
        System.out.println("After Remove : " + smartWatchList.size());
    }
}
