package edu.maryville.isys320.TriviaNight;

public class BuildTriviaNightPresentation {

	public static void main(String[] args) {
		try {
			String fileName = "TriviaNight.pptx";
			SlideShowBuilder builder = new SlideShowBuilder();
			QuestionsManager qm = new QuestionsManager("data");

			String[] categories = qm.getCategories();
			String[] questions = qm.getQuestions();
			String[] answers = qm.getAnswers();

			if (categories.length != 10) {
				System.out.println("Category length is not correct");
				System.exit(-1);
			}
			if (questions.length != 100) {
				System.out.println("Question amount is not correct");
				System.exit(-1);
			}
			if (answers.length != 100) {
				System.out.println("Answer amount is not correct");
				System.exit(-1);
			}

			builder.buildSlideShow(categories, questions, answers, fileName);
			// builder.printSlideShowInfo("TriviaNight.pptx");
		} catch (Exception ex) {
			System.out.println("WRONG!!!");
		}
	}

}