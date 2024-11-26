import React from 'react'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"

export function FaqTexto() {
    return(
        <a href="faq.html#quest{number}">
            <div className="ask ask{number}">
                <p>Título pergunta</p>
                <i className='bi bi-arrow-right'></i>
            </div>
        </a>
    )
}

export function Faq() {
    return (
        <section className="sect FAQ">
            {Titulo('FAQ', 'FAQ')}
            <article className="per FAQ-conteudo">
                <div className="texto-faq">
                    <h3>Ficou com alguma dúvida?</h3>
                    {Button('faq', 'Confira', './faq')}
                </div>
                <div className="perguntas-faq">
                    {FaqTexto()}
                    {FaqTexto()}
                    {FaqTexto()}
                </div>
            </article>
        </section>
    )
}