import React from 'react'
import ImgS from './../../media/pages/sobre/etno-equipe.png'

export function Home() {
    return (
        <>
            <section className="container-about">
                <article className="text-about">
                    <h1>Quem somos</h1>
                    <p>A Comissão ETNO BIRIGUI é responsável pelo desenvolvimento de ações antirracismo no campus Birigui e junto à comunidade externa, sendo formada por docentes, discentes, técnicos administrativos e membros da comunidade externa.</p>
                </article>
                <article className="img-about">
                    <img src={ImgS} alt="Equipe da Comissão ETNO BIRIGUI"></img>
                </article>
            </section>
            <section className="missao-about">
                <b>❝ Acreditamos que o conhecimento é uma importante ferramenta de combate ao racismo, por essa razão nos comprometemos com o desenvolvimento de ações que o promovam. ❞</b>
                <i>~ Elisandra Pereira</i>
            </section>
        </>
    )
}
