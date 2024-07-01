/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.alsdkritorno;

import it.mds.sdk.aljavalib.exception.AccessLayerException;
import it.mds.sdk.aljavalib.module.FlussoRequestSdkRitorno;
import it.mds.sdk.aljavalib.service.FlussoService;
import it.mds.sdk.rest.persistence.entity.sdkritorno.RisultatoElaborazione;

public class FlussoSdkRitorno {


    private FlussoService flussoService;

    public FlussoSdkRitorno(FlussoService flussoService) {
        this.flussoService = flussoService;
    }

    public RisultatoElaborazione getStatoElaborazioniSdkRitorno(FlussoRequestSdkRitorno flussoRequestSdkRitorno) throws AccessLayerException {
        RisultatoElaborazione verificaStato = flussoService.getStatoElaborazioniSdkRitorno(flussoRequestSdkRitorno);
        return verificaStato;
    }
}
