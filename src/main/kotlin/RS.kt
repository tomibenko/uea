import kotlin.math.abs

class RS (maxFes:Int):Algorithm (maxFes) {

    override fun execute(problem: Problem): Solution {
        var agents = mutableListOf<Solution>()
        var neke=999999999.0;
        var i=0
        repeat(maxFes){
            i++
           var x=problem.randomSolution()
         if (!problem.isFeasible(x)){
            x= problem.setFeasible(x)
             agents.add(x)
         }
            else{
             agents.add(x)
            }


            agents[it] = problem.fitness(agents[it])
           // println(agents[it].fitnessValue.toString()+"  kandidati" + agents[it].kandidat.toString())
            if (agents[it].fitnessValue<neke){
                neke=agents[it].fitnessValue
                println( "stevilo: "+i+" ::" + neke + "  kandidati:" + agents[it].kandidat.toString() )
            }
        }
        println(neke)
        return agents.minBy { it.fitnessValue }
    }
}