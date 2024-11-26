import React from 'react';

export function Home() {
    return (
        <>
        <h1>Encontre todas as notícias da plataforma.</h1>
        <div className="search-container">
            <div className="search-bar">
                <input type="text" placeholder="O que você procura?" oninput="buscarTexto()" />
                <button type="submit" onclick="buscarTexto()"><i className='bi bi-search'></i></button>
            </div>
            <div className="filter">
                <button type="button">Mais recentes</button> 
                <button type="button">Mais antigas</button>
            </div>
        </div>
        </>
    )
}