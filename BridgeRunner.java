class BridgeRunner {

    public static void main(String[] args) {

        Bridge b1 = new Bridge();
        Bridge b2 = new Bridge();

        b1.supportVehicles();
        b1.allowPedestrians();
        b1.connectCities();
        b1.carryLoad();
        b1.resistWind();
        b1.resistWaterFlow();
        b1.provideSafety();
        b1.enableTransport();
        b1.reduceTraffic();
        b1.supportRailway();
        b1.allowShipPassage();
        b1.handleWeightLimit();
        b1.undergoMaintenance();
        b1.withstandEarthquake();
        b1.improveConnectivity();

        b2.supportVehicles();
        b2.allowPedestrians();
        b2.connectCities();
        b2.carryLoad();
        b2.resistWind();
        b2.resistWaterFlow();
        b2.provideSafety();
        b2.enableTransport();
        b2.reduceTraffic();
        b2.supportRailway();
        b2.allowShipPassage();
        b2.handleWeightLimit();
        b2.undergoMaintenance();
        b2.withstandEarthquake();
        b2.improveConnectivity();

        Bridge.showBridgeType();
        Bridge.showConstructionYear();
        Bridge.showBridgeLength();
        Bridge.showMaterialUsed();
        Bridge.showFamousBridges();
    }
}