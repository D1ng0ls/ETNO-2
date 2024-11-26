import React from 'react'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"

export function Sobre() {
    return (
        <section className="sect sobre">
            {Titulo('sobre', 'Sobre')}
            <article className="sob sobre-conteudo">
                <div className="texto-sobre">
                    <p>A Comissão ETNO Birigui é uma equipe multidisciplinar formada por docentes, discentes, técnicos administrativos e membros da comunidade externa, dedicada ao desenvolvimento de ações antirracismo no campus Birigui e em parceria com a comunidade local.</p>
                    
                    <p>Nosso principal objetivo é elevar a consciência sobre questões raciais e promover a inclusão por meio da educação, conscientização e engajamento da comunidade.</p>
                </div>
            </article>
            {Button('sobre', 'Conheça nossa história', './sobre')}
        </section>
    )
}