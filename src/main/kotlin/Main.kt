package org.example

import Ackley
import Bukin
import Levy
import Problem
import RS
import Rosenbrock
import Schwefel26
import Solution
import Sphere
import Trid
import neke.CarromTable
import kotlin.random.Random

fun main() {

   var dimensions =2
   var problems = listOf(
      Sphere(dimensions),
      Ackley(dimensions),
      Schwefel26(dimensions),
      Rosenbrock(dimensions),
      Bukin(2),
      CarromTable(2),
      Levy(2),
      Trid(dimensions)
   )
   var algorithm = RS(20000)
   for (problem in problems)
   {
      println(problem.name)
     val neke= algorithm.execute(problem)
      println(neke.fitnessValue)
   }









}