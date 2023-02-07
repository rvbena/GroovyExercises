String encode(String data) {
    String compressed = ""
    def pattern = "(.)\\1{0,}"
    def repeat = data.findAll(pattern)

    for (outer in repeat) {
        if (outer.length() > 1)
            compressed += outer.length()

        compressed += outer[0]
    }

    compressed
}

String decode(String data) {
    String reconstruct = ""
    def pattern = "\\d+|\\w"
    def dataArr = data.findAll(pattern)
    int ctr = 0

    for (x in dataArr) {
        if (x.isNumber())
            ctr = Integer.parseInt(x)
        
        else {
            if (ctr == 0)
                reconstruct += x

            else {
                reconstruct += x * ctr
                ctr = 0
            }
        }
    }

    reconstruct
}

println encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB")
println decode("10AB3CD4E")