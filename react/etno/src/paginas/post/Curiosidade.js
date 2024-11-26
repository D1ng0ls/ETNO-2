import React from "react";
import { Postagem } from "../../library/Postagem";

export function Curiosidade() {
    return (
        <section className="social-media-posts" id="curiosidades">
            <p className="social-media-tittle-post">Curiosidades</p>
            <hr/>
            <div className="social-media-cards">
                {Postagem(3)}
                {Postagem(3)}
                {Postagem(3)}
                {Postagem(3)}
                {Postagem(3)}
                {Postagem(3)}
            </div>
        </section>
    )
}