import React, { useState, useEffect } from 'react';
import { useLocation } from 'react-router-dom';

import logo from './../media/global/logo-branco.png';
import logo2 from './../media/global/logo-brown.svg';

export default function Header() {
    const [logoHeader, setLogoHeader] = useState(logo);
    const [menuOpen, setMenuOpen] = useState(false);
    const [headerFixed, setHeaderFixed] = useState(false);
    const location = useLocation();

    // Troca a logo com base no caminho atual
    useEffect(() => {
        if (['/noticias', '/eventos', '/posts'].includes(location.pathname)) {
            setLogoHeader(logo2);
        } else {
            setLogoHeader(logo);
        }
    }, [location.pathname]);

    // Monitora o scroll para fixar o header
    useEffect(() => {
        const handleScroll = () => {
            setHeaderFixed(window.scrollY > 0);
        };

        window.addEventListener('scroll', handleScroll);
        return () => {
            window.removeEventListener('scroll', handleScroll);
        };
    }, []);

    // Alterna o menu hamburguer
    const toggleMenu = () => {
        setMenuOpen(!menuOpen);
    };

    return (
        <header className={`header ${headerFixed ? 'fixed' : ''} ${menuOpen ? 'abre-menu' : ''}`} id="header">
            <div className="header-logo">
                <a className="Header-link" href="/" rel="noopener noreferrer">
                    <img src={logoHeader} className="ETNO-logo" alt="logo" />
                </a>
            </div>
            <nav className='header-menu'>
                <ul>
                    <li>
                        <a className="Header-link" href="/">
                            Home
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="noticias">
                            Notícias
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="eventos">
                            Eventos
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="posts">
                            Posts
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="sobre">
                            Sobre
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="faq">
                            FAQ
                        </a>
                    </li>
                    <li>
                        <a className="Header-link" href="user">
                            <i className="bi bi-person-circle"></i>
                        </a>
                    </li>
                </ul>
            </nav>
            <div className={`menu ${menuOpen ? 'menu-open' : ''}`} id="burgermenu" onClick={toggleMenu}>
                <i className={`bi ${menuOpen ? 'bi-x' : 'bi-list'}`}></i>
            </div>
        </header>
    );
}
