import React, { useState } from 'react';
import Img from './../../media/pages/noticias/Noticia PM.png';
import { ErrorSearch } from './ErrorSearch';

export function Home() {
    const [searchTerm, setSearchTerm] = useState("");
    const [sortOrder, setSortOrder] = useState("recentes");

    const noticias = [
        {
            id: 1,
            content: "Lorem ipsum dolor sit amet consectetur adipisicing.",
            date: "2024-12-01 14:00",
            link: "https://link1.com",
            img: Img,
        },
        {
            id: 2,
            content: "Aliquam tincidunt mauris eu risus.",
            date: "2024-12-02 10:30",
            link: "https://link2.com",
            img: Img,
        },
        {
            id: 3,
            content: "Cras ornare tristique elit.",
            date: "2024-11-30 08:15",
            link: "https://link3.com",
            img: Img,
        },
    ];

    const sortedNoticias = [...noticias].sort((a, b) => {
        if (sortOrder === "recentes") {
            return new Date(b.date) - new Date(a.date);
        } else {
            return new Date(a.date) - new Date(b.date);
        }
    });

    const filteredNoticias = sortedNoticias.filter((noticia) =>
        noticia.content.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <>
            <h1>Encontre todas as notícias da plataforma.</h1>

            <div className="search-container">
                <div className="search-bar">
                    <input
                        type="text"
                        placeholder="O que você procura?"
                        value={searchTerm}
                        onChange={(e) => setSearchTerm(e.target.value)}
                    />
                    <button type="button">
                        <i className="bi bi-search"></i>
                    </button>
                </div>

                {/* Botões de filtro */}
                <div className="filter">
                    <button
                        type="button"
                        onClick={() => setSortOrder("recentes")}
                        className={sortOrder === "recentes" ? "active" : ""}
                    >
                        Mais recentes
                    </button>
                    <button
                        type="button"
                        onClick={() => setSortOrder("antigas")}
                        className={sortOrder === "antigas" ? "active" : ""}
                    >
                        Mais antigas
                    </button>
                </div>
            </div>

            {/* Lista de notícias */}
            <div className="news-container">
                {filteredNoticias.length > 0 ? (
                    filteredNoticias.map((noticia) => (
                        <a key={noticia.id} href={noticia.link}>
                            <div className="news-item">
                                <div className="news-content">
                                    <p>{noticia.content}</p>
                                    <button>{new Date(noticia.date).toLocaleDateString('pt-BR', { day: '2-digit', month: '2-digit', year: 'numeric' })} - {new Date(noticia.date).toLocaleTimeString('pt-BR', { hour: '2-digit', minute: '2-digit' })}</button>
                                </div>
                                <img src={noticia.img} alt={`Notícia ${noticia.id}`} />
                            </div>
                        </a>
                    ))
                ) : (
                    <ErrorSearch />
                )}
            </div>
        </>
    );
}
