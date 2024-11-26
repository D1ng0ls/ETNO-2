import React from 'react'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"

export function NoticiaTexto() {
    return (
        <div className="noticia-texto">
            <div><b>Notícias</b></div>
            <p>Título notícia.</p>
            <span>dd/mm/yyyy</span>
        </div>
    )
}

export function Noticia() {
    return (
        <section className="sect noticias">
            {Titulo('noticias', "Notícias")}
            <article className="art noticias-conteudo">
                <div className="noticias-container">
                    <div className="noticia-recente">
                        {NoticiaTexto()}
                    </div>
                    <div className="noticias-diversas">
                        <div className="noticia not1">
                            {NoticiaTexto()}
                        </div>
                        <div className="noticia not2">
                            {NoticiaTexto()}
                        </div>
                        <div className="noticia not3">
                            {NoticiaTexto()}
                        </div>
                        <div className="noticia not4">
                            {NoticiaTexto()}
                        </div>
                    </div>
                </div>
                    {Button('noticias','Mais Notícias', './noticias')}
            </article>
        </section>
    )
}