import React from 'react'
import logo from './../media/global/logo-branco.png';

export default function Header() {
  return (
    <header className="header">
        <div className="header-logo">
            <a
                className="Header-link"
                href="https://reactjs.org"
                target="_blank"
                rel="noopener noreferrer"
            >
                <img src={logo} className="ETNO-logo" alt="logo" />
            </a>
        </div>
        <nav className="header-menu">
            <ul>
                <li>
                    <a
                        className="Header-link"
                        href="index.html"
                    >
                        Home
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="noticias.html"
                    >
                        Notícias
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="eventos.html"
                    >
                        Eventos
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="posts.html"
                    >
                        Posts
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="sobre.html"
                    >
                        Sobre
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="faq.html"
                    >
                        FAQ
                    </a>
                </li>
            </ul>
        </nav>
        <div className="menu" onclick="burgermenu()">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5"/>
            </svg>
        </div>
    </header>

  );
}