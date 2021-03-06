import quizDetail, { question } from "../../type/quizDetail";

const quiz: quizDetail = {
    category: "other",
    crete_username: "test",
    description: "test",
    id: 1,
    thumbnail: "",
    title: "title",
    questions:createQuestion()
}


function createQuestion () {
    let ret = [];
    for (let i = 0; i < 10; i++) {
        let q: question = {
            name: 'テスト',
            id: i,
            choices: [
                { selection_no: 1, content: '選択肢1', qusetionId: i },
                { selection_no: 2, content: '選択肢2', qusetionId: i },
                { selection_no: 3, content: '選択肢3', qusetionId: i },
                { selection_no: 4, content: '選択肢4', qusetionId: i },
            ],
            content: `${i+1}問目です`,
            comment: 'コメントです',
            num: i + 1
        }
        ret.push(q);
    }
    return ret;

}


export default quiz;