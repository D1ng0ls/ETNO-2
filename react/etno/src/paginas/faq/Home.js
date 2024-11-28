import React from 'react'

export function FAQTexto() {
    return (
        <article className="faq-question question1">
            <div className="title-quest" id="quest1" onclick="abre('1')">
                <h3>Lorem ipsum dolor sit amet?</h3>
                <i className='bi bi-chevron-right'></i>
            </div>
            <div className="text-quest" id="text1">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro rem eaque provident soluta.</p>
            </div>
        </article>
    )
}

export function Home() {
    return (
        <>
            <div className="faq-title">
                <h1>Perguntas frequentes</h1>
            </div>
            <section className="faq">
                {FAQTexto()}
                {FAQTexto()}
                {FAQTexto()}
                {FAQTexto()}
                {FAQTexto()}
            </section>
        </>
    )
}
