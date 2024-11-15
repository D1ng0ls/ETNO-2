import React from 'react'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"

export function FaqTexto() {
    return(
        <a href="faq.html#quest{number}">
            <div className="ask ask{number}">
                <p>Título pergunta</p>
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8"/>
                </svg>
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
                    {Button('faq', 'Confira', 'faq.html')}
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