package com.xworkz.function.interfaces;

@FunctionalInterface
public interface VoteEligibility {
    boolean canVote(int age);
}
