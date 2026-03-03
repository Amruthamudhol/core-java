class ResourceRunner {

    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();

        r1.allocate();
        r1.utilize();
        r1.conserve();
        r1.distribute();
        r1.replenish();
        r1.monitor();
        r1.manage();
        r1.protect();
        r1.renew();
        r1.consume();
        r1.recycle();
        r1.store();
        r1.transport();
        r1.evaluate();
        r1.optimize();

        r2.allocate();
        r2.utilize();
        r2.conserve();
        r2.distribute();
        r2.replenish();
        r2.monitor();
        r2.manage();
        r2.protect();
        r2.renew();
        r2.consume();
        r2.recycle();
        r2.store();
        r2.transport();
        r2.evaluate();
        r2.optimize();

        Resource.showTypes();
        Resource.showImportance();
        Resource.showExamples();
        Resource.showRenewableInfo();
        Resource.showNonRenewableInfo();
    }
}