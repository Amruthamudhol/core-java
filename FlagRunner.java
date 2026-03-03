class FlagRunner {

    public static void main(String[] args) {

        Flag f1 = new Flag();
        Flag f2 = new Flag();

        f1.hoist();
        f1.lower();
        f1.wave();
        f1.fold();
        f1.unfold();
        f1.salute();
        f1.clean();
        f1.dry();
        f1.stitch();
        f1.inspect();
        f1.replace();
        f1.displayOnStage();
        f1.carryInParade();
        f1.tieToPole();
        f1.untieFromPole();

        f2.hoist();
        f2.lower();
        f2.wave();
        f2.fold();
        f2.unfold();
        f2.salute();
        f2.clean();
        f2.dry();
        f2.stitch();
        f2.inspect();
        f2.replace();
        f2.displayOnStage();
        f2.carryInParade();
        f2.tieToPole();
        f2.untieFromPole();

        Flag.showColors();
        Flag.showSymbol();
        Flag.showHistory();
        Flag.showImportance();
        Flag.showTypes();
    }
}