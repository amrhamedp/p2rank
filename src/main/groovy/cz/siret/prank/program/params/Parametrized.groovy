package cz.siret.prank.program.params

/**
 * provides variables attribute for easy access to global parameters
 */
trait Parametrized {

    Params getParams() {
        return Params.INSTANCE
    }

}