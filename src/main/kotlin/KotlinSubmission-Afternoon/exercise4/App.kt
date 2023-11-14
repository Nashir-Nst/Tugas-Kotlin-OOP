package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    try {
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val indexToRead = 8

        val value = numbers[indexToRead]
        println("Nilai di indeks $indexToRead adalah: $value")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Exception terjadi: Indeks diluar batas array!")
    } finally {
        println("Ini akan selalu dijalankan, terlepas dari apakah ada exception atau tidak.")
    }


}