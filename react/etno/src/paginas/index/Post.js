import React from 'react'
import Post1 from './../../media/pages/index/img1_insta.jpg'
import {Titulo} from "./../../library/Titulo"
import {Button} from "./../../library/Button"


export function PostTexto() {
    return(
    <a href="posts.html#instagram">
        <div className="img-post">
            <img
                src={Post1}
                alt="Post imagem"
            />
        </div>
        <div className="text-post">
            <div className="info-text-post">
                <span>Tag?</span>
                <b>yy ago</b>
            </div>
            <p>Texto postagem...</p>
        </div>
    </a>
    )
}

export function Post() {
    return (
        <section className="sect posts">
            {Titulo('post', 'Posts')}
            <article className="art posts-conteudo">
                <div className="post post1">
                    {PostTexto()}
                </div>
                <div className="post post2">
                    {PostTexto()}
                </div>
                <div className="post post3">
                    {PostTexto()}
                </div>
            </article>
            {Button('posts', 'Mais Postagens', './posts')}
        </section>
    )
}