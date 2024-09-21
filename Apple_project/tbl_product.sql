-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2024 at 07:00 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apple`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_product`
--

CREATE TABLE `tbl_product` (
  `pid` int(11) NOT NULL,
  `title` varchar(1024) NOT NULL,
  `body` varchar(1024) NOT NULL,
  `price` float NOT NULL,
  `qty` int(11) NOT NULL,
  `image` varchar(2048) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_product`
--

INSERT INTO `tbl_product` (`pid`, `title`, `body`, `price`, `qty`, `image`) VALUES
(1, 'iPhone 16 Pro', 'Pricing for iPhone 16 and iPhone 16 Plus includes a $30 connectivity discount that requires activati', 999, 10, 'https://product.hstatic.net/1000120098/product/iphone-16-pro-max-titan-sa-mac__1__3535f515d6464adf969beae5174b2a8b_grande.png'),
(2, 'Apple Watch Ultra 2', 'LTPO3 OLED Always-On Retina display\r\nWide-angle OLED\r\nUp to 2000 nits\r\nUp to 40% brighter when viewed at an angle.\r\n44mm or 40mm aluminum case size', 300, 30, 'https://parspng.com/wp-content/uploads/2023/06/watchpng.parspng.com-9.png'),
(3, 'Apple Watch Series 10', 'Thinnest. Biggest display.22 Advanced health featureECG app2\r\nHigh and low heart rate notifications\r\nIrregular rhythm notifications3\r\nLow cardio fitness notifications\r\nSleep apnea notifications4s.\r\n', 400, 30, 'https://www.apple.com/v/watch/bo/images/overview/select/product_s10__deak4mdempoy_xlarge.png'),
(4, 'Apple Watch SE', 'Emergency SOS7\r\nInternational emergency calling8\r\nFall Detection and Crash Detection7.Water resistant12\r\nSwimproof12\r\nDepth to gauge 40m\r\nWater temperature sensor\r\nHigh-speed water sports\r\nRecreational scuba to 40m', 249, 20, 'https://www.apple.com/v/watch/bo/images/overview/select/product_se__frx4hb13romm_xlarge.png'),
(5, 'iPad Air 4th (2020)', 'iPad Air 4th 2020 (In stock)\r\nColor: Grey, Silver, Green, Blue, Rose Gold\r\nOnly Wifi \r\n64G= $579\r\n256G= $759\r\n512G= Call Us\r\nSIM+Wifi\r\n64G= $699\r\n256G= out of stock\r\nCall us for more: 081|085 3333 16', 800, 10, 'https://khmerapsaraphone.com/wp-content/uploads/2022/09/ipad-air-4-gray.jpg'),
(6, 'iPad Air 5 (2022) M1 Chip', 'iPad Air 5 (2022) M1 Chip \r\nColor: Space Gray, Starlight, Pink, Purple, Blue\r\nOnly WiFi\r\n64GB :  $569\r\n256GB : $679\r\nSIM+WiFi\r\n64GB : $639\r\n256GB : $779\r\nif 1 year warranty by Falcon\r\nOnly WiFi\r\n64GB : $579\r\n256GB : $709\r\nSIM+WiFi\r\n64GB : $669\r\n256GB : $839', 569, 20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2t3FfJo1rkiChoQJCsENGziAPQn2qcsfFzQ&s'),
(7, 'iPad Pro 11 (2021) M1 Chip', 'iPad Pro 11-inches 2021\r\nColor: Silver, Gray\r\nOnly Wi-Fi (CPO – White Box)\r\n128GB : $659 \r\n256GB : $739\r\nSim+Wi-Fi (CPO – White Box)\r\n128GB : $759 ', 659, 10, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjYM7-QrUoYQFE5Sz0Ea26AigGBQvOGTpNYA&s'),
(8, 'Apple iPad Pro 12.9 2022 Price in Pakistan', 'Dimensions	280.6 x 214.9 x 6.4 mm (11.05 x 8.46 x 0.25 in)\r\nWeight	682 g (Wi-Fi), 685 g (5G) (1.50 lb)\r\nBuild	Glass front, aluminum back, aluminum frame\r\nSIM	Nano-SIM, eSIM\r\nColors	Silver, Space Gray', 1099, 20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCA5hPbdhu67Uqh5k_KPYsqbe6L6X9Ko2DaJ_jEtCUo9y17HJN2X7ID1ahM12X1sTANpM&usqp=CAU'),
(9, 'Apple Watch Ultra', 'Blending lightweight comfort with contemporary elegance. Torsade references nautical chains brought to life as a continuous knit band in rich, saturated hues. Lightweight and comfortable, Torsade is available in a Single Tour and a Double Tour that wraps twice around the wrist.', 699, 10, 'https://www.apple.com/v/apple-watch-hermes/ag/images/hardware/sporty__el91v2sj42i6_large.jpg'),
(10, 'Apple AirPods Max USB C - Blue', 'e her høretelefoner har meget praktisk en indbygget mikrofon. Høretelefonerne er praktiske at bruge, da de er uden kabel.Læs mere\r\n\r\nSammenlign priser fra 4.139 kr. til 4.699 kr.\r\n', 200, 50, 'https://www.pricerunner.dk/product/232x232/3136284868/Apple-AirPods-Max-USB-C-Blue.jpg?ph=true'),
(11, 'Apple AirPods Max with Lightning', 'orkæl dine ører med Apple AirPods Max. De flotte og støjreducerende Apple høretelefoner giver højeste komfort med sublim lydkvalitet. Nem tilslutning med dine Apple enheder.', 300, 40, 'https://www.pricerunner.dk/product/640x640/3134336806/Apple-AirPods-Max-with-Lightning.jpg'),
(12, 'Apple AirPods', 'Bundle Includes: 1 x Apple AirPods Max (Sky Blue), 1 x Portable PowerBank, 2 x USB Power Cube, 1 x Goby Labs Headphone Cleaner 4 fl oz , 1 x Microfiber Fiber Cloth\r\nA RADICALLY ORIGINAL COMPOSITION - The over-ear headphone has been completely reimagined. From cushion to canopy, AirPods Max are designed for an uncompromising fit that creates the optimal acoustic seal for many different head shapes fully immersing you in every sound.\r\nSOUNDS LIKE AN EPIPHANY - AirPods Max combine high-fidelity audio with industry-leading Active Noise Cancellation to deliver an unparalleled listening experience. Each part of their custom-built driver works to produce sound with ultra-low distortion across the audible range. From deep, rich bass to accurate mids and crisp, clean highs, you ll hear every note with a new sense of clarity.\r\nCOMPUTATIONAL AUDIO. KEY TO PERFORMANCE -With a powerful Apple?designed H1 chip in each cup, our custom acoustic design, and advanced software, AirPods Max use computational audio to create a bre', 300, 20, 'https://i5.walmartimages.com/asr/8850d7e2-6fa2-4d25-bf70-0a4e5ff69366.74f4cf899a86123076d9db16d30f2e87.jpeg'),
(13, 'Apple iPhone 16', 'The iPhone 16 camera system is a sure winner at both close and long distances. The 48MP Fusion camera gives you impressive resolution, and the 2x optically enhanced telephoto lens lets you get close to the action without moving. The ultra-wide-angle lens lets you take everything from extreme macro shots to panoramic shots that fit an entire landscape. It’s like carrying four lenses in your pocket.', 1000, 20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZdwsYSJrDd4st3fUoUvXaXE1Ea_GqCteAeg&s'),
(14, 'Apple iPhone 16 ', 'Whether you\'re on a business trip or enjoying a vacation, the Apple iPhone 16 smartphone, with its 6.1-inch Super Retina XDR OLED screen and 2556x1179 resolution, lets you indulge in uninterrupted binge-watching. Furthermore, the high refresh rate minimises screen tearing during gaming and fast-action scenes, which delivers an enhanced experience.', 1200, 10, 'https://media-ik.croma.com/prod/https://media.croma.com/image/upload/v1725959516/Croma%20Assets/Communication/Mobiles/Images/309693_0_aaeau6.png?tr=w-600'),
(15, 'Apple iPhone 15 Pro', 'Dynamic Island, Always-On Display, ProMotion Technology with Adaptive Refresh Rates Up to 120Hz, HDR Display, True Tone, Wide Color (P3), Haptic Touch, 2,000,000:1 Contrast Ratio (Typical), 1000 nits Max Brightness (Typical); 1600 nits Peak Brightness (HDR); 2000 nits Peak Brightness (Outdoor), Fingerprint-Resistant Oleophobic Coating, Support for Display of Multiple Languages and Characters Simultaneously', 999, 20, 'https://starlight-kw.com/cdn/shop/files/Apple-Iphone-15-Pro-5G-6_1-128Gb-Natural-Titanium-Mobiles-Gadgets-Apple-Starlight-Kuwait.webp?v=1714562854'),
(16, 'Apple iPhone 14 Pro Max ', 'ynamic Island Always-On display ProMotion technology with adaptive refresh rates up to 120Hz HDR display True Tone Wide color (P3) Haptic Touch 2,000,000:1 contrast ratio (typical) 1000 nits max brightness (typical); 1600 nits peak brightness (HDR); 2000 nits peak brightness (outdoor) Fingerprint-resistant oleophobic coating Support for display of multiple languages and characters simultaneously', 900, 20, 'https://media.centrepointstores.com/i/centrepoint/165542706-100000349742-BASE512GB_01-2100.jpg?fmt=auto&$quality-standard$&sm=c&$prodimg-m-prt-pdp-2x$'),
(17, 'Apple MAcBook Air 2023', 'Apple MAcBook Air 2023 15 in ( 512 GB SSD, Apple M2 3.4 GHz, 8 GB , Mac OS ) Laptop - Starlight (MQKV3LL/A)', 1200, 10, 'https://i.ebayimg.com/images/g/5dMAAOSw5gVmyL1S/s-l1600.jpg'),
(18, 'Apple 2024 MacBook Air ', 'Apple 2024 MacBook Air 13-inch Laptop with M3 chip: Built for Apple Intelligence, 13.6-inch Liquid Retina Display, 8GB Unified Memory, 256GB SSD Storage, Backlit Keyboard, Touch ID; Midnight', 1500, 20, 'https://m.media-amazon.com/images/I/71-D1xCuVwL._AC_UF894,1000_QL80_.jpg'),
(19, 'Apple MacBook Air ', 'Apple MacBook Air M2 13.6\" 256GB 8GB Space Gray MLXW3LL/A 2022. 8GB Unified RAM | 256GB SSD. Model Year Mid 2022. Apple M2 8-Core Chip. Color : Space Gray . GPU Apple (8-Core). Key Features. Maximum Brightness 500 cd/m2.', 799.74, 10, 'https://i.ebayimg.com/images/g/-QoAAOSwdQNkC1Rz/s-l640.jpg'),
(20, 'Apple MacBook Air 2024 ', 'Lean. Mean. M3 Machine. The blazing-fast MacBook Air with the M3 chip is a super-portable laptop that sails through work and play and the M3 chip brings even greater capabilities to the super-portable 13.6-inch MacBook Air. With up to 18 hours of battery life and a spacious Liquid Retina display, you can take it anywhere and blaze through work and play. Get more done faster with 8-core CPU and up to 10-core GPU to power through complex tasks. Superfast SSD storage launches apps and opens files in an instant.', 1500, 10, 'https://media.4rgos.it/i/Argos/4726665_R_Z001A?w=750&h=440&qlt=70');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
