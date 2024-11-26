import React from "react";
import { Postagem } from "../../library/Postagem";

export function Facebook() {
    return (
        <section className="social-media-posts" id="facebook">
            <p className="social-media-tittle-post">Facebook</p>
            <hr/>
            <div className="social-media-cards">
                {Postagem(1)}
                {Postagem(1)}
                {Postagem(1)}
            </div>
        </section>
    )
}