package pl.hw05

import org.scalactic.Tolerance._
import org.scalatest.flatspec.AnyFlatSpec

import hw05._

class hw05Spec extends AnyFlatSpec:
   
   // Tests for Problem 1
   
   "binom" should "compute the binomial coefficient of n and k" in {
     for (n <- 0 to 16; k <- 0 to n) {
       assert (binomNaive(n, k) === binom(n, k))
     }
   }
  
   "trib" should "compute the n-th tribonacci number" in {
     for (n <- 0 to 10) {
       assert (tribNaive(n) === trib(n))
     }     
   }
