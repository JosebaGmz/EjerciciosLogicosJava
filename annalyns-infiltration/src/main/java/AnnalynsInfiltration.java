class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean fastAttack= false;
        if(!knightIsAwake){
            fastAttack = true;
        }
        return fastAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spy = false;
        if(prisonerIsAwake || knightIsAwake || archerIsAwake){
            spy = true;
        }
        return spy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signalPrisoner = false;
        if(prisonerIsAwake && !archerIsAwake){
            signalPrisoner = true;
        }
        return signalPrisoner;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean freePrisoner = false;
        if(petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake){
            freePrisoner = true;
        }
        return freePrisoner;
    }
}
