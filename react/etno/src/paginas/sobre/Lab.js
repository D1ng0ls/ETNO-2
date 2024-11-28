import React from "react";
import ImgLab from './../../media/pages/sobre/lab-etno.png'

export function Lab() {
    return (
        <section className="container-lab">
            <h2>Lab ETNO</h2>
            <article className="conteudo-lab">
                <div className="img-lab">
                    <img src={ImgLab} alt="Laboratório ETNO Birigui"></img>
                </div>
                <div className="text-lab">
                    <p>O Laboratório de Ações Étnico-Raciais foi conquistado em junho de 2020, mas devido a Pandemia, somente em 2022, foi possível frequentá-lo. Todos os itens do Laboratório são frutos de doação. Ali estão livros, revistas, a exposição história africana e afrobrasileira ”Nossas Raízes” da artista e professora de Birigui, Sueli Cordeiro. Há alguns jogos de origem indígena como a peteca e o jogo da onça, mas também africano, como o Mancala -  jogo de estratégia.</p>
                </div>
            </article>
        </section>
    )
}