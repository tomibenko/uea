
abstract class Algorithm {
    var maxFes=10000;

    constructor(maxFes:Int){
        this.maxFes=maxFes;
    }

    abstract fun execute(problem: Problem): Solution
}