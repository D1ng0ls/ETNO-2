import React from 'react'
import Evento1 from './../../media/pages/index/home-eventos-img.png'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"

export function EventoTexto() {
    return(
        <>
            <div className="data-evento">
                <p><span>DD</span><br/>MM</p>
            </div>
            <div className="texto-evento">
                    <h3>Título evento</h3>
                    <p>Descrição evento</p>
            </div>
        </>
    )
}

export function Evento() {
    return(
        <section className="sect eventos">
            {Titulo('eventos', "Eventos")}
            <article className="art eventos-conteudo">
                <div className="eventos-container">
                    <div className="evento-recente">
                        <img 
                            src={Evento1}
                            id="img-event"
                            alt="Evento imagem"
                        />
                    </div>
                    <div className="eventos-diversos">
                        <div className="evento eve1 selecionado">
                            {EventoTexto()}
                        </div>
                        <div className="evento eve2">
                            {EventoTexto()}
                        </div>
                    </div>
                </div>
                {Button('eventos','Mais Eventos', './eventos')}
            </article>
        </section>
    )
}