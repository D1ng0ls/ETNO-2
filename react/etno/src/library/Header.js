import React, { useState, useEffect } from 'react';
import {useLocation } from 'react-router-dom';

import logo from './../media/global/logo-branco.png';
import logo2 from './../media/global/logo-brown.svg';

function TrocaLogo() {
    const [logoHeader, setLogoHeader] = useState(logo);
    const location = useLocation();
  
    useEffect(() => {
        if (location.pathname === '/noticias' || location.pathname === '/eventos' || location.pathname === '/posts') {
            setLogoHeader(logo2);
        } else {
            setLogoHeader(logo);
        }
    }, [location.pathname]);
  
    return logoHeader;
}

export default function Header() {
    let logoAtual = TrocaLogo()

  return (
    
    <header className="header">
        <div className="header-logo">
            <a
                className="Header-link"
                href="https://reactjs.org"
                target="_blank"
                rel="noopener noreferrer"
            >
                <img src={logoAtual} className="ETNO-logo" alt="logo" />
            </a>
        </div>
        <nav className="header-menu">
            <ul>
                <li>
                    <a
                        className="Header-link"
                        href="/"
                    >
                        Home
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="noticias"
                    >
                        Notícias
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="eventos"
                    >
                        Eventos
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="posts"
                    >
                        Posts
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="sobre"
                    >
                        Sobre
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="faq"
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