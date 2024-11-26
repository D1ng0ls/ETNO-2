import React from "react";
import {Postagem} from "../../library/Postagem";

export function Instagram() {
    return (
        <section className="social-media-posts" id="instagram">
            <p className="social-media-tittle-post">Instagram</p>
            <hr/>
            <div className="social-media-cards">
                {Postagem(2)}
                {Postagem(2)}
                {Postagem(2)}
            </div>
        </section>
    )
}