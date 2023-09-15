fun main() {
    var b=Rook().create("rb4")
}


interface Chess {
    fun move(file: String,rank: String)
    fun create(piecePosition:String):Any
    fun position()


}

open class Queen(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): Queen {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}
open class Rook(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): Rook {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}
open class Knight(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): Knight {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}
open class King(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): King {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}
open class Bishop(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): Bishop {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}
open class Pawn(
    var name: String="",
    var file: String="",
    var rank: String=""
) : Chess{


    override fun move(file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")




    }


    override fun create(piecePosition: String): Pawn {
        this.name= piecePosition[0].toString()
        this.file= piecePosition[1].toString()
        this.rank= piecePosition[2].toString()
        return (this)



    }

    override fun position() {
        println("file is ${this.file} rank is${this.rank}")
    }




}







