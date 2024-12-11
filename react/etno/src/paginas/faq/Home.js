import React, {useState} from 'react'

var cont = 0;

export function FAQTexto() {
    cont++;
    const [questOpen, setQuestOpen] = useState(false);

    const toggleQuest = () => {
        setQuestOpen(!questOpen);
    };

    return (
        <article className={`faq-question question${cont}`}>
            <div className={`title-quest ${questOpen? 'gira' : ''}`} id={`quest${cont}`} onClick={toggleQuest}>
                <h3>Lorem ipsum dolor sit amet?</h3>
                <i className='bi bi-chevron-right'></i>
            </div>
            <div className={`text-quest ${questOpen? 'aberto' : ''}`} id={`text${cont}`}>
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
                <FAQTexto />
                <FAQTexto />
                <FAQTexto />
                <FAQTexto />
                <FAQTexto />
            </section>
        </>
    )
}