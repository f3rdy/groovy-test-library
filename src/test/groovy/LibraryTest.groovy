import spock.lang.Specification
import spock.lang.Shared
import org.ferdy.groove.MathLibrary

class LibraryTest extends Specification {

    @Shared lib

    def setupSpec() {
        lib = new MathLibrary()
    }

    def  "returns true when expected"() {
           expect:
        true == lib.returnTrue()
    }

    def "returns false when expected"() {
        expect:
        false == lib.returnFalse()
    }

    def "library add function returns expected results"() {
        expect:
        z == lib.add(x,y)

        where:
        x | y | z
        1 | 1 | 2
        -1 | 1 | 0
    }

    def "added object is returned"() {
        when:
        lib.addItem("Name", "Fred")

        then:
        lib.getItem("Name") == "Fred"
    }

    def "accessing a non-existing key results to KeyError"() {
        when:
        lib.getItem("non-existing")

        then:
        thrown Exception
    }
}
