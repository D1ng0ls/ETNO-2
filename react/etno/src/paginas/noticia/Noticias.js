import React from 'react';
import Img from './../../media/pages/noticias/Noticia PM.png'

export function NoticiaTexto() {
    return (
        <a href="https://link.com">  
            <div className="news-item">
                <div className="news-content">
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing. </p>
                    <button>DD/MM/AAAA - hh:mm</button>
                </div>
                <img src={Img} alt="Notícia 1"></img>
            </div>
        </a>
    )
}

export function Noticias() {
    return (
        <div className="news-container">
            {NoticiaTexto()}
            {NoticiaTexto()}
            {NoticiaTexto()}
            {NoticiaTexto()}
            {NoticiaTexto()}
        </div>
    )
}

